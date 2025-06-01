package com.harshaSpring.BeanCreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {


     final Frosting frosting;
     final Syrup syrup;

    CakeBaker(@Qualifier("strawFrosting") Frosting frosting,@Qualifier("chocoSyrup") Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }
    void bakeCake() {
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
