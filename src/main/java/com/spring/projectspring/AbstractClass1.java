package com.spring.projectspring;

import com.spring.projectspring.ConcreteDependancies.ConcreteDependance1;
import com.spring.projectspring.ConcreteDependancies.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {

    private final ConcreteDependance1 test1;
    private final ConcreteDependance2 test2;

    public AbstractClass1(ConcreteDependance1 test1, ConcreteDependance2 test2) {
        this.test1 = test1;
        this.test2 = test2;
    }
}
