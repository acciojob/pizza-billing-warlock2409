package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;

    private boolean cheese;
    private boolean toppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppingsPrice=70;
        }else{
            this.price=400;
            this.toppingsPrice=120;
        }
        this.takeAwayPrice=20;
        this.cheesePrice=80;
        this.bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.cheese) {
            this.price = this.price + 80;
            this.cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg && !this.toppings){
            this.price+=70;
        }else if(!this.toppings){
            this.price+=120;
        }
        this.toppings=true;

    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway){
            this.price+=20;
            this.takeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.bill+="Base Price Of The Pizza: 300"+"\n";
        }else{
            this.bill+="Base Price Of The Pizza: 400\n";
        }
        if(this.cheese){
            this.bill+="Extra Cheese Added: "+this.cheesePrice+"\n";
        }
        if(this.toppings){
            this.bill+="Extra Toppings Added: "+this.toppingsPrice+"\n";
        }
        if(this.takeAway){
            this.bill+="Paperbag Added: "+this.takeAwayPrice+"\n";
        }
        this.bill+="Total Price:"+this.getPrice();

        return this.bill;
    }
}
