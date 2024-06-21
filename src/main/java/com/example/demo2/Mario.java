package com.example.demo2;

import org.springframework.context.annotation.Bean;

public class Mario implements GamingConsole{

    @Override
    public void left() {
        System.out.println("Mario left");
    }

    @Override
    public void right() {
System.out.println("Mario right");
    }

    @Override
    public void up() {
System.out.println("Mario up");
    }

    @Override
    public void down() {
System.out.println("Mario down");
    }
}
