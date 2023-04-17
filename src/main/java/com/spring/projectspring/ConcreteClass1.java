package com.spring.projectspring;

import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass1{
    public ConcreteClass1(ConcreteDependance1 test1, ConcreteDependance2 test2) {
        super(test1, test2);
    }
}
