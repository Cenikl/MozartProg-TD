package com.spring.projectspring.ConcreteClass;

import com.spring.projectspring.AbstractClass1;
import com.spring.projectspring.ConcreteDependancies.ConcreteDependance1;
import com.spring.projectspring.ConcreteDependancies.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass1 extends AbstractClass1 {
    public ConcreteClass1(ConcreteDependance1 test1, ConcreteDependance2 test2) {
        super(test1, test2);
    }

}
