package ProxyDesignPattern.ImageExample;

// RealSubject: Actual high-resolution image
public class RealImage implements Image{

    private String filename;

    public RealImage(String filename){
        this.filename=filename;
        loadImageFromDisk();
    }


    private void loadImageFromDisk(){
        System.out.println("Loading image: "+ filename);
        // Simulate loading image from disk
    }

    @Override
    public void display() {
        System.out.println("Displaying image: "+ filename);
        // Actual image rendering logic
    }
}
