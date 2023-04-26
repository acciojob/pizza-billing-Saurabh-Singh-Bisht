package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean takeAway;
    private boolean addCheese;
    private boolean addtopping;

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
        if(this.addCheese == false){
            this.addCheese = true;
            this.price += 80;
            this.bill += "Extra Cheese Added: " + 80 + "\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.addtopping == false){
            if(this.isVeg){
                this.price += 70;
                this.bill += "Extra Toppings Added: " + 70 + "\n";
            }
            else {
                this.price += 120;
                this.bill += "Extra Toppings Added: " + 120 + "\n";
            }
            this.addtopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.takeAway == false){
            this.takeAway = true;
            this.price += 20;
            this.bill += "Paperbag Added: " + 20 + "\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.price;
        return this.bill;
    }
}
