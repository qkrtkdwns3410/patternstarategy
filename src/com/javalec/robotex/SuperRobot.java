package com.javalec.robotex;

import java.io.PipedReader;
import java.net.StandardSocketOptions;

public class SuperRobot extends Robot{
    @Override
    public void actionFly() {
        System.out.println("날수있음");
    }
    
    @Override
    public void actionMisille() {
        System.out.println("미사일 발사가능");
    }
    
    @Override
    public void actionKnife() {
        System.out.println("미사일 가능");
    }
    
    public SuperRobot() {
        System.out.println("********************");
        System.out.println("슈퍼로봇!");
    
    }
    
    
}
