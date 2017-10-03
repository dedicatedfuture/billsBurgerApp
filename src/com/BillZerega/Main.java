package com.BillZerega;

public class Main {

    public static void main(String[] args) {
	    Hamburger newOrder = new Hamburger("Krista order", "pretzel", "salmon", 6.67);
	    HealthyBurger healthNut = new HealthyBurger("veggie", 9.80);

        System.out.println(newOrder.getBreadRoll());
        System.out.println(newOrder.getPrice());
        newOrder.addOnion(true, .50);
        newOrder.addTomato(true, .75);
        newOrder.addBacon(true, 1.35);

        newOrder.checkPrice();
        healthNut.checkPrice();

        healthNut.addMushroom(true, .75);
        healthNut.addOnion(true, .5);
        healthNut.checkPrice();

        DeluxeHamburger hungryHippo = new DeluxeHamburger("beef");

        hungryHippo.checkPrice();



    }
}
