package com.javalec.robotex;

public class LowRobot extends Robot {
    @Override
    public void actionFly() {
        System.out.println("날수없음");
    }
    
    @Override
    public void actionMisille() {
        System.out.println("미사일 불가능");
    }
    
    @Override
    public void actionKnife() {
        System.out.println("검없음");
    }
    
    public LowRobot() {
        System.out.println("********************");
        System.out.println("꾸진 로봇!");
    
    }
    
}
