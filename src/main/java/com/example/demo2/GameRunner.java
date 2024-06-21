package com.example.demo2;

import org.springframework.context.annotation.Bean;

public class GameRunner {
    GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole = gamingConsole;
    }
    public void run(){
        System.out.println("Welcome to the Gaming");
    }
}
