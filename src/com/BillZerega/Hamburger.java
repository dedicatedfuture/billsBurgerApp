package com.BillZerega;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Bill on 6/29/17.
 */
public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private double lettuceCost;
    private boolean tomato;
    private double tomatoCost;
    private boolean onion;
    private double onionCost;
    private boolean bacon;
    private double baconCost;
    private double price;
    private double totalPrice;


    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void addLettuce(boolean lettuce, double lettuceCost){
        this.lettuce = lettuce;
        this.lettuceCost = lettuceCost;
    }

    public void addTomato(boolean tomato, double tomatoCost){
        this.tomato = tomato;
        this.tomatoCost = tomatoCost;
    }

    public void addOnion(boolean onion, double onionCost){
        this.onion = onion;
        this.onionCost = onionCost;
    }

    public void addBacon(boolean bacon, double baconCost){
        this.bacon = bacon;
        this.baconCost = baconCost;
    }

    public double checkPrice(){
        double totalPrice = 0;
        System.out.println(this.name + " burger on a " + this.getBreadRoll() + " with " +
                this.getMeat() + " meat costs $" + this.getPrice());

        if (this.lettuce || this.tomato || this.onion || this.bacon == true){
            totalPrice += this.getPrice() + this.lettuceCost + this.tomatoCost + this.onionCost +
                    this.baconCost;

            System.out.println("Lettuce: " + this.lettuceCost);
            System.out.println("Tomato: " + this.tomatoCost);
            System.out.println("Onion: " + this.onionCost);
            System.out.println("Bacon: " + this.baconCost);
            System.out.println("total cost of your order: " + totalPrice);
        }
        return totalPrice;



    }
}
