package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int takeAway;
    private boolean takeAwayC;
    private int addCheese;
    private boolean addCheeseC;
    private int addTopping;
    private boolean addToppingC;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        }
        else {
            this.price = 400;
            this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.addCheeseC == false){
            this.price += 80;
            this.addCheese += 80;
            this.addCheeseC = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.addToppingC == false){
            if(this.isVeg){
                this.price += 70;
                this.addTopping += 70;
            }
            else {
                this.price += 120;
                this.addTopping += 120;
            }
            this.addToppingC = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.takeAwayC == false){
            this.price += 20;
            this.takeAway += 20;
            this.takeAwayC = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.addCheese > 0){
            this.bill += "Extra Cheese Added: " + this.addCheese + "\n";
        }
        if(this.addTopping > 0){
            this.bill += "Extra Toppings Added: " + this.addTopping + "\n";
        }
        if(this.takeAway > 0){
            this.bill += "Paperbag Added: " + this.takeAway + "\n";
        }
        this.bill += "Total Price: " + this.price;
        return this.bill;
    }
}
