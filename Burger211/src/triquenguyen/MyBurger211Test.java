package triquenguyen;

/**
 * Trique Nguyen
 * 950730526
 * July 17th, 2021
 * The program purpose is to print out the menu of a burger company based on its franchises, location or countries.
 * The tempJSON.java is to read the JSON file from the url of the web
 */

public class MyBurger211Test {
    public static void main(String[] args) throws Exception {

        tempJSON temp = new tempJSON();

        // Bellevue, WA USA
        Burger211 Bellevue = new USA();
        double BellevueTemp = temp.getTemp(getURL("Bellevue"));
        tempPromotion(BellevueTemp, Bellevue);
        Bellevue.Menu("Bellevue");

        // Seattle, WA USA
        Burger211 Seattle = new USA();
        double SeattleTemp = temp.getTemp(getURL("Seattle"));
        tempPromotion(SeattleTemp, Seattle);
        Seattle.Menu("Seattle");

        // Hanoi, Vietnam Franchise
        Burger211 Hanoi = new VIETNAM();
        double HanoiTemp = temp.getTemp(getURL("Hanoi"));
        tempPromotion(HanoiTemp, Hanoi);
        Hanoi.Menu("Hanoi");

        // Ho Chi Minh City, Vietnam
        Burger211 Dalat = new VIETNAM();
        double DalatTemp = temp.getTemp(getURL("Dalat"));
        tempPromotion(DalatTemp, Dalat);
        Dalat.Menu("Dalat");
    }

    /**
     * Function to get the url by inserting the city name in the middle of the URL
     * This will shorten the code in main, makes it less lengthy
     *
     * @param city
     * @return
     */
    public static String getURL(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+ city +"&appid=ddf63769f7a1c95e2f0bd587422d9471";
        return url;
    }

    /**
     * Function to get the promotion based on temperature
     * The recent promotion for city's temperature above 70 F degrees
     * because all of them are below 90 degrees
     *
     * @param temp
     * @param city
     */
    public static void tempPromotion(double temp, Burger211 city) {
        if (temp > 70) {
            city.Promotion(0.1, "10% Off for Hot Day, Come ENJOY!");
        }
    }
}
