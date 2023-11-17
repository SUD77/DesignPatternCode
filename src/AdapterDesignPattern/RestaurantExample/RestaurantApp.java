package AdapterDesignPattern.RestaurantExample;

public class RestaurantApp implements RestaurantAppInterface{

    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println("Displaying Menus using XML data");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Displaying recommendations using XML data");
    }
}
