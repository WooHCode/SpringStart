package com.containstudy.demo.chapter03.used;

import org.springframework.stereotype.Component;

//@Component
public class MorningGreet implements Greet{
    @Override
    public void greeting(){
        System.out.println("-----------------");
        System.out.println("좋은아침입니다");
        System.out.println("-----------------");
    }
}
