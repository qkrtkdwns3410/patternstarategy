package com.javalec.robotex;

import com.javalec.robotex.inter.*;

import java.io.PipedReader;
import java.net.StandardSocketOptions;

public class SuperRobot extends Robot {
    
    IFly fly = new FlyYes(); //날 수 있습니다.
    IMissaile missaile = new Misailyes(); //미사일 발사가능
    IKnife knife = new IKnifeL(); //레이저 미사일
    

    
    public SuperRobot() {
        System.out.println("********************");
        System.out.println("슈퍼로봇!");
        
    }
    
    
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
    
    @Override
    public void setFly(IFly fly) {
        this.fly = fly;
    }
    
    @Override
    public void setMissaile(IMissaile missaile) {
        this.missaile = missaile;
    }
    
    @Override
    public void setKnife(IKnife knife) {
        this.knife = knife;
    }
    
    
}
