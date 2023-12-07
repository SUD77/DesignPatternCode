package ProxyDesignPattern.ImageExample;


/*******************************************

Note : Concept of Virtual Proxy

**************************************/
public class ImageClient {
    public static void main(String[] args) {

        // Using the Proxy to display the image
        Image image = new ProxyImage("high_res_image.jpg");


        // Below, if else is to check if it is the same instance or not.
        // Check if the image is loaded
        if (((ProxyImage) image).isLoaded()) {
            System.out.println("Image loaded");
        } else {
            System.out.println("Image not loaded yet");
        }


        // Image will be loaded and displayed only when needed
        image.display();


        // Now, check again
        if (((ProxyImage) image).isLoaded()) {
            System.out.println("Image loaded");
        } else {
            System.out.println("Image not loaded yet");
        }

        // If we call display again, the image won't be reloaded
        image.display();
    }
}
