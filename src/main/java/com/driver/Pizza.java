package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int vegPizzaBase = 300;
    private int nonVegPizzaBase = 400;
    private boolean isCheeseAdded;
    private int cheesePrice = 80;

    private boolean isToppingAdded;
    private int toppingPrice;
    private int vegTopping = 70;
    private int nonVegTopping = 120;

    private boolean takeAway;
    private int addTakeAway = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        basePrice = isVeg ? vegPizzaBase : nonVegPizzaBase;
        price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            price += cheesePrice;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            if(isVeg){
                isToppingAdded = true;
                toppingPrice = vegTopping;
                price += toppingPrice;
            }
            else {
                isToppingAdded = true;
                toppingPrice = nonVegTopping;
                price += toppingPrice;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            takeAway = true;
            price += addTakeAway;
        }

    }

    public String getBill(){
        // your code goes here
        String var ="Base Price Of The Pizza: " + basePrice + "\n";
        if(isCheeseAdded){
            var += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingAdded){
            var += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if(takeAway){
            var += "Paperbag Added: " + addTakeAway + "\n";
        }
        var += "Total Price: " + price + "\n";
        this.bill = var;
        return this.bill;
    }
}
