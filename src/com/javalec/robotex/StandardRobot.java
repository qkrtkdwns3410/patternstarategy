package com.javalec.robotex;

public class StandardRobot extends  Robot{
    @Override
    public void actionFly() {
        System.out.println("날수 있음");
    }
    
    @Override
    public void actionMisille() {
        System.out.println("미사일 발사 불가능");
    }
    
    @Override
    public void actionKnife() {
        System.out.println("목검 사용");
    }
    
    public StandardRobot() {
        System.out.println("********************");
        System.out.println("스탠다드로봇!");
    }

    
}
