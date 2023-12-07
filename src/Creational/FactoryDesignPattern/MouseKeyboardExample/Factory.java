package Creational.FactoryDesignPattern.MouseKeyboardExample;

public class Factory {

    static Mouse getMouse(String type){

        Mouse mouse;

        if(type.equals("AppleMouse")){
            mouse=new AppleMouse();
        }else{
            mouse=new MicrosoftMouse();
        }

        return mouse;
    }
}
