package com.harshaSpring.BeanCreation;

import org.springframework.stereotype.Component;

@Component("chocoSyrup")
public class ChocoSyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}
