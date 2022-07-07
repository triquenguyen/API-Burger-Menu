package triquenguyen;

import java.text.DecimalFormat;

public class VIETNAM extends Burger211 {
    static double exchangeRate = 23000;
    private double discountRate = 0;
    private String[] burgerNamePrice = new String[getHowManyBurgers()];

    @Override
    public String getBurgerTopping(int i) {
        if (i == 2) {
            return ("fried fish, cheese, onion, mayonnaise, ketchup");
        } else if (i == 0){
            return ("beef patty, tomato, onion, ranch sauce");
        } else {
            return ("fried shrimp, egg, tomato, onion, ketchup");
        }
    }

    String pro = "";

    public void Promotion(Double discount, String promote) {
        discountRate = discount;
        pro = promote;
    }

    public void Menu(String franchise) {
        DecimalFormat df = new DecimalFormat("#,###,###");

        for (int i = 0; i < getHowManyBurgers(); i++) {
            burgerNamePrice[i] = getBurgerName(i) + " / " + df.format(getBurgerPrice(i) * (1.0 - discountRate) * exchangeRate) + " VND";
            if (discountRate > 0.0) {
                burgerNamePrice[i] += " (regular: " + df.format(getBurgerPrice(i) * exchangeRate) + ")";
            }
        }
        new MenuGUI(franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));
    }
}
