package ProxyDesignPattern.ImageExample;


// Proxy: Controls access to the RealSubject
/* Basically, real object will be called only once or when required on the basis of logic.
No unnecessary calls to realObject
* */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String filename;
    private boolean loaded;

    public ProxyImage(String filename){
        this.filename=filename;
        this.loaded=false;
    }


    @Override
    public void display() {

        // Lazy initialization: create the RealImage only when needed
        if (!loaded) {
            realImage = new RealImage(filename);
            loaded = true;
        }

        // Delegating the display to the RealImage
        realImage.display();
    }

    public boolean isLoaded() {
        return loaded;
    }
}
