package com.javalec.robotex;

import com.javalec.robotex.inter.IFly;
import com.javalec.robotex.inter.IKnife;
import com.javalec.robotex.inter.IMissaile;

public abstract class Robot {
    
    IFly fly;
    IMissaile missaile;
    IKnife knife;
    
    public void actionWalk() {
        System.out.println("걸을 수 있습니다.");
    }
    
    public void actionRun() {
        System.out.println("달릴수 있습니다.");
    }
    
    public void shape() {
        System.out.println("로봇입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다.");
    }
    
    public void setFly(IFly fly) {
        this.fly = fly;
    }
    
    public void setMissaile(IMissaile missaile) {
        this.missaile = missaile;
    }
    
    public void setKnife(IKnife knife) {
        this.knife = knife;
    }
    
    public abstract void actionMisille();
    
    public void actionKnife() {
        this.knife.knife();
    }
    
    public void actionFly() {
        this.fly.fly();
    }
    
    public void actionMisail() {
        this.missaile.misail();
    }
}




















