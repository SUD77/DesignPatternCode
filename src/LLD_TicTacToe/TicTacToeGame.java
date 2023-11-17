package LLD_TicTacToe;

import LLD_TicTacToe.Model.*;
import javafx.util.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class TicTacToeGame {

    Deque<Player> players;
    Board boardGame;

    public void initialize(){
        players = new LinkedList<>();
        Player player1 = new Player("Shivangi" , new PlayingPieceO());
        Player player2 = new Player("Sudhanshu" , new PlayingPieceX());
        players.add(player1);
        players.add(player2);

        boardGame = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;

        while(noWinner){
            Player playerTurn = players.removeFirst();
            boardGame.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = boardGame.getFreeCells();
            //Tie case
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("PLayer " + playerTurn.name + " Enter row, column : ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");

            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = boardGame.addPiece(inputRow, inputCol, playerTurn.playingPiece);

            if(!pieceAddedSuccessfully){
                System.out.println("Incorect Position chosen, Try Again !");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow , inputCol , playerTurn.playingPiece.pieceType);

            if(winner){
                return playerTurn.name;
            }

        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int col , PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        for(int i=0; i<boardGame.size; i++){
            if(boardGame.board[row][i] == null || boardGame.board[row][i].pieceType != pieceType ){
                rowMatch=false;
            }
        }

        for(int i=0; i<boardGame.size; i++){
            if(boardGame.board[i][col] == null || boardGame.board[i][col].pieceType != pieceType ){
                colMatch=false;
            }
        }

        for(int i=0,j=0; i<boardGame.size; i++,j++){
            if(boardGame.board[i][j] == null || boardGame.board[i][j].pieceType != pieceType ){
                diagMatch=false;
            }
        }

        for(int i=0,j=boardGame.size-1; i<boardGame.size; i++,j--){
            if(boardGame.board[i][j] == null || boardGame.board[i][j].pieceType != pieceType ){
                antiDiagMatch=false;
            }
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }


}
