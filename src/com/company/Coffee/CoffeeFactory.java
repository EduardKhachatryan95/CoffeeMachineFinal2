package com.company.Coffee;

public class CoffeeFactory {

    public Coffee getCoffee(String coffeeType){

        if(coffeeType == null){
            return null;
        }
        if(coffeeType.equalsIgnoreCase("1")){
            return new Espresso();
        } else if(coffeeType.equalsIgnoreCase("2")){
            return new Latte();
        } else if(coffeeType.equalsIgnoreCase("3")){
            return new Cappuccino();
        }
        return new Espresso();
    }
}
