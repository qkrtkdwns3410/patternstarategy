package com.javalec.robotex;

public abstract class Robot {
    public void actionWalk() {
        System.out.println("걸을 수 있습니다.");
    }
    
    public void actionRun() {
        System.out.println("달릴수 있습니다.");
    }
    
    public void shape() {
        System.out.println("로봇입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다.");
    }
    
    public abstract void actionFly();
    public abstract void actionMisille();
    public abstract void actionKnife();
    
    
}
