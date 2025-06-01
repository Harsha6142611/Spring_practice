package com.harshaSpring.BeanCreation;

import org.springframework.stereotype.Component;

@Component("strawSyrup")
public class StrawSyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("Strawberry Syrup");
    }
}
