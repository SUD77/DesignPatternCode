package Structural.CompositeDesignPattern.FileSystem;

public class File implements Component {

    private String name;

    public File(String name){
        this.name=name;
    }


    @Override
    public void display() {
        System.out.println("File: "+ name);
    }
}
