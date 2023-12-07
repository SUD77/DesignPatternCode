package Structural.AdapterDesignPattern.RestaurantExample;

public class FancyUIServiceAdaptor implements RestaurantAppInterface{

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdaptor(){
        this.fancyUIService=new FancyUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData=convertXmlToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData=convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData){

        /* some logic to convert XML data to Json data is implemented here.
           -    I am not writing data logic, as it can be complex on the basis of scenerio.
        * */
        System.out.println("Converting XML to Json...");
        return new JsonData();
    }
}
