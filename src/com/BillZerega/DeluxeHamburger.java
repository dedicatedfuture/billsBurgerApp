package com.BillZerega;

/**
 * Created by Bill on 6/29/17.
 */
public class DeluxeHamburger extends Hamburger {
    private boolean chips;
    private double chipsCost = 2.25;
    private boolean drink;
    private double drinkCost = 1.75;

    public DeluxeHamburger(String meat) {
        super("Deluxe Burger ", "Sesame", meat, 5.99);
        this.chips = true;
        this.drink = true;
    }

    public boolean isChips() {
        return chips;
    }

    public double getChipsCost() {
        return chipsCost;
    }

    public boolean isDrink() {
        return drink;
    }

    public double getDrinkCost() {
        return drinkCost;
    }


    @Override
    public double checkPrice() {
        double totalPrice = super.checkPrice();

            totalPrice += this.chipsCost + this.drinkCost;

            System.out.println("Chips: " + this.chipsCost);
            System.out.println("Soda: " + this.drinkCost);

            System.out.println("total cost of your order: " + totalPrice);

        return totalPrice;

    }
}
