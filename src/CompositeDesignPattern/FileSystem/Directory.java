package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component{

    private String name;
    private List<Component> components=new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void display() {

        System.out.println("Directory: " + name);
        System.out.println("Contents:");

        for(Component component:components){
            component.display();
        }
    }
}
