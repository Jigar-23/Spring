package com.example.demo2.Configurations;

import com.example.demo2.GameRunner;
import com.example.demo2.GamingConsole;
import com.example.demo2.Mario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GamingConsole gamingConsole() {
        return new Mario();
    }
    @Bean(name ="gameRunner")
    public GameRunner appGaming(GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }





}
