package com.javalec.robotex;

import com.javalec.robotex.inter.*;

public class LowRobot extends Robot {
    
    
    IFly fly = new FlyNo();
    IMissaile missaile = new MisailNo();
    IKnife knife = new IKnifeNo();
    
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
