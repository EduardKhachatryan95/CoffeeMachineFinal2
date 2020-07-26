package com.company.comand;

public class CommandFactory {
    public CommandInterface getCommands(String command) {
        if(command.equalsIgnoreCase("Buy")){
            return new Buy();
        } else if(command.equalsIgnoreCase("Fill")){
            return new Fill();
        } else if(command.equalsIgnoreCase("Take")){
            return new Take();
        } else if(command.equalsIgnoreCase("Remaining")){
            return new Remaining();
        } else if(command.equalsIgnoreCase("Exit")){
            System.out.println("EXIT");
            return null;
        }
        return null;
    }
}
