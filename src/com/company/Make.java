package com.company;

import com.company.comand.CommandFactory;
import com.company.comand.CommandInterface;

import java.util.Scanner;

public class Make {

    String command = null;
    Scanner in = new Scanner(System.in);
    Resources resources = new Resources();

    public void init(){
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        this.command = in.nextLine();
        if(this.command != "exit") {
            this.start();
        }
    }
    public  void start() {
        CommandFactory commandsFactory = new CommandFactory();
        CommandInterface command =  commandsFactory.getCommands(this.command);
        command.start(this.resources, this.in);
        this.init();
    }



}
