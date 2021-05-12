package com.javalec.robotex;

public class ARobot extends Robot{
    @Override
    public void actionFly() {
        System.out.println("우주까지 난다");
    }
    
    @Override
    public void actionMisille() {
        System.out.println("무한 미사일");
    }
    
    @Override
    public void actionKnife() {
        System.out.println("사무라이검");
    }
}
