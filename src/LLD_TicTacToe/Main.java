package LLD_TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initialize();

        System.out.println("Game winner is  " + game.startGame() );
    }
}
