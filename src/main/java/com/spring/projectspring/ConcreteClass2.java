package com.spring.projectspring;


import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1{
    public ConcreteClass2(ConcreteDependance1 test1, ConcreteDependance2 test2) {
        super(test1, test2);
    }
}
