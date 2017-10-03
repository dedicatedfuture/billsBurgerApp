package com.BillZerega;

/**
 * Created by Bill on 6/29/17.
 */
public class HealthyBurger extends Hamburger {
    private boolean mushroom;
    private double mushroomCost;
    private boolean spinach;
    private double spinachCost;

    public boolean isMushroom() {
        return mushroom;
    }

    public double getMushroomCost() {
        return mushroomCost;
    }

    public boolean isSpinach() {
        return spinach;
    }

    public double getSpinachCost() {
        return spinachCost;
    }

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "brown rye roll", meat, price);
    }

    public void addMushroom(boolean mushroom, double mushroomCost){
        this.mushroom = mushroom;
        this.mushroomCost = mushroomCost;
    }

    public void addSpinach(boolean spinach, double spinachCost){
        this.spinach = spinach;
        this.spinachCost = spinachCost;
    }


    @Override
    public double checkPrice() {
        double totalPrice = super.checkPrice();
        if (this.mushroom || this.spinach == true){
            totalPrice += this.spinachCost + this.mushroomCost;

            System.out.println("Mushroom: " + this.mushroomCost);
            System.out.println("Spinach: " + this.spinachCost);

            System.out.println("total cost of your order: " + totalPrice);
        }
        return totalPrice;
    }
}
