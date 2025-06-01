package com.harshaSpring.BeanCreation;

import org.springframework.stereotype.Component;

@Component("chocoFrosting")
public class ChocoFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting");
    }
}
