package com.javalec.robotex;

import com.javalec.robotex.inter.*;

public class StandardRobot extends Robot {
    
    IFly fly = new FlyYes();
    MisailNo iMissaile = new MisailNo();
    IKnifeW iKnifeW = new IKnifeW();
    
    public StandardRobot() {
        System.out.println("********************");
        System.out.println("스탠다드로봇!");
    }
    
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
    
    @Override
    public void setFly(IFly fly) {
        this.fly = fly;
    }
    
    public void setiMissaile(MisailNo iMissaile) {
        this.iMissaile = iMissaile;
    }
    
    public void setiKnifeW(IKnifeW iKnifeW) {
        this.iKnifeW = iKnifeW;
    }
}
