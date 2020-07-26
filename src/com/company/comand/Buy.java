package com.company.comand;

import com.company.Coffee.Coffee;
import com.company.Coffee.CoffeeFactory;
import com.company.Resources;
import java.util.Arrays;
import java.util.Scanner;

public class Buy implements CommandInterface {
    private String makeCoffeeType;

    @Override
    public void start(Resources resources, Scanner in) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        this.makeCoffeeType =  in.nextLine();
        String mas = validation(resources);
        System.out.println(mas);
    }

    public String validation(Resources resources){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee typeOfCo = coffeeFactory.getCoffee(this.makeCoffeeType);
        Integer count = this.canMake(typeOfCo,resources);
        if(count >= 0) {
            return "I have enough  resources, making you a coffee";
        }
        String[] notEnoughArray = this.notEnough(typeOfCo, resources);
        String notEnoughText = "";
        for (String val: notEnoughArray) {
            if(!val.equals("")) notEnoughText += val+" ";
        }
        return "Sorry, not enough(s) "+notEnoughText+" !";
    }

    private String[] notEnough(Coffee typeOfC,Resources resources){
        int water =  resources.getResourcesWater()  - typeOfC.getWater();
        int milk =   resources.getResourcesMilk()   - typeOfC.getMilk();
        int coffee = resources.getResourcesCoffee() - typeOfC.getCoffee();
        String waterEnough = (water < 0)   ? "water" : "";
        String milkEnough = (milk < 0)     ? "milk" : "";
        String coffeeEnough = (coffee < 0) ? "coffee" : "";
        return new String[]{waterEnough, milkEnough, coffeeEnough};
    }
    private Integer canMake(Coffee typeOfC,Resources resources){
        Integer water =  resources.getResourcesWater()  - typeOfC.getWater();
        Integer milk =   resources.getResourcesMilk()   - typeOfC.getMilk();
        Integer coffee = resources.getResourcesCoffee() - typeOfC.getCoffee();
        Integer count =  getMinVal(water,milk,coffee);

        if(count >= 0){
            resources.setResourcesWater(water);
            resources.setResourcesMilk(milk);
            resources.setResourcesCoffee(coffee);

            resources.setResourcesCups( resources.getResourcesCups() -1 );
            resources.setResourcesMoney(resources.getResourcesMoney() + typeOfC.getMoney());
        }

        return count;
    }
    private Integer getMinVal(Integer water,Integer milk, Integer coffee){
        Integer[] caps = {
                water,
                milk,
                coffee,
        };
        Arrays.sort(caps);
        return caps[0];
    }
}
