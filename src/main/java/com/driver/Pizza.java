package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }else{
            this.price=400;
        }
        this.bill="";
        this.cheese=0;
        this.toppings=0;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

            this.price = this.price + 80;
            this.cheese++;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg ){
            this.price+=70;
        }else {
            this.price+=120;
        }
        this.toppings++;

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
            this.bill+="Base Price Of The Pizza: 300 \n";
            if(this.cheese !=0){
                this.bill+="Extra Cheese Added: "+ 80*this.cheese+ "\n";
            }
            if(this.toppings != 0){
                this.bill+="Extra Toppings Added: " +70*this.toppings+ " \n";
            }
        }else{
            this.bill+="Base Price Of The Pizza: 400 \n";
            if(this.cheese != 0){
                this.bill+="Extra Cheese Added: "+ 80 * this.cheese+"\n";
            }
            if(this.toppings != 0){
                this.bill+="Extra Toppings Added: "+120*this.toppings+" \n";
            }
        }
        if(this.takeAway){
            this.bill+="Paperbag Added: 20 \n";
        }
        this.bill+="Total Price: "+this.getPrice()+"\n";

        return this.bill;
    }
}
