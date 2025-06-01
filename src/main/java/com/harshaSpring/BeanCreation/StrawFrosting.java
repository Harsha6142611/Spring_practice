package com.harshaSpring.BeanCreation;

import org.springframework.stereotype.Component;

@Component("strawFrosting")
public class StrawFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting");
    }
}
