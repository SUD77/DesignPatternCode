package Structural.AdapterDesignPattern.RestaurantExample;


/*
*  Situation : Suppose your app has been working with XMl data till now and one day, you decided to use
* a 3rd party API, which can enhance your UI in a much better way. But problem is that, this 3rd party API onlu works
* with json data.
* So, to solve this problem and use 3rd party API, you will have to convert xml data to json data and feed it to that 3rd party API.
* We will do this using Adaptor pattern.
*
* Where,
* Our existing UI uses - RestaurantAPP class to display data
* 3rd party Api - FancyUIService.
*
* Adaptor - FancyUIAdaptor .  - > this converts xml data to json data and feeds to 3rd party API, which then displays
* the data in better format.
*
*
* Note : In this example, I havent implemented the actual code to covert xml to json. Or to show data in some fancy format
* This example is for demonstration purpose showing the use of Adaptor desin pattern
*
* */
public class MainApp {

    public static void main(String[] args) {

        XmlData xmlData=new XmlData();

        // OLd UI
        RestaurantAppInterface restaurantApp=new RestaurantApp();
        restaurantApp.displayMenus(xmlData);
        restaurantApp.displayRecommendations(xmlData);


        // new UI
        FancyUIServiceAdaptor adaptor=new FancyUIServiceAdaptor();
        adaptor.displayMenus(xmlData);
        adaptor.displayRecommendations(xmlData);
    }
}
