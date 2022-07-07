package triquenguyen;

import java.text.DecimalFormat;

/**
 * USA is the sub class of Burger211, which return franchise's information in the U.S.
 */
public class USA extends Burger211 {

    private double discountRate = 0;
    private String[] burgerNamePrice = new String[getHowManyBurgers()];

    String pro = "";

    /**
     * Take in the value of discount from the franchise
     *
     * @param discount
     * @param promote
     */
    public void Promotion(Double discount, String promote) {
        discountRate = discount;
        pro = promote;
    }

    /**
     * Print out the menu of that franchise in the U.S.
     *
     * @param franchise
     */
    public void Menu(String franchise) {
        DecimalFormat df = new DecimalFormat("#,###,###.00");

        for (int i = 0; i < getHowManyBurgers(); i++) {
            burgerNamePrice[i] = getBurgerName(i) + " / " + "$" + df.format(getBurgerPrice(i) * (1.0 - discountRate));
            if (discountRate > 0.0) {
                burgerNamePrice[i] += " (regular: " + df.format(getBurgerPrice(i)) + ")";
            }
        }
        new MenuGUI(franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));
    }
}
