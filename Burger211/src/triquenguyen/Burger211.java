package triquenguyen;

import java.util.*;

/**
 * Creates a constructor
 */
class BurgerInfo {
    String name;
    double price;
    String topping;
}

public abstract class Burger211 {

    private ArrayList<BurgerInfo> Burger = new ArrayList<>();

    Burger211() {

        BurgerInfo b1 = new BurgerInfo();
        b1.name = "Inheritance Burger";
        b1.price = 3.0;
        b1.topping = "beef patty, tomato, onion, ranch sauce";
        Burger.add(b1);

        BurgerInfo b2 = new BurgerInfo();
        b2.name = "Overidding Burger";
        b2.price = 2.0;
        b2.topping = "beef patty, lime, onion, tomato sauce";
        Burger.add(b2);

        BurgerInfo b3 = new BurgerInfo();
        b3.name = "Inheritance Burger";
        b3.price = 3.5;
        b3.topping = "chicken breast, gallo, onion, ranch sauce";
        Burger.add(b3);
    }

    /**
     * Method to get burger's name
     *
     * @param i
     * @return
     */
    public String getBurgerName(int i) {
        return Burger.get(i).name;
    }

    /**
     * Method to get burger's price
     *
     * @param i
     * @return
     */
    public double getBurgerPrice(int i) {
        return Burger.get(i).price;
    }

    /**
     * Method to get burger's topping
     *
     * @param i
     * @return
     */
    public String getBurgerTopping(int i) {
        return Burger.get(i).topping;
    }

    /**
     * Method to get the number of burgers
     *
     * @return
     */
    public int getHowManyBurgers() {
        return Burger.size();
    }

    abstract void Menu(String franchise);

    abstract void Promotion(Double discountRate, String promote);
}
