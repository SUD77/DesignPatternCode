package CompositeDesignPattern.FileSystem;

public class FileSystemClient {

    public static void main(String[] args) {


        //Creating files
        File file1=new File("file1.text");
        File file2=new File("file2.text");
        File file3=new File("file3.text");

        //Creating directory
        Directory directory1=new Directory("Folder1");
        Directory directory2=new Directory("Folder2");


        //Adding files to directory1
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        //Adding files to directory2
        directory2.addComponent(file3);

        //Adding directory2 to dir1
        directory1.addComponent(directory2);

        directory1.display();

    }
}
