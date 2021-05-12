package com.javalec.robotex;

public class MainClass {
    
    public static void main(String[] args) {
        SuperRobot superRobot = new SuperRobot();
        superRobot.actionMisille();
        
        StandardRobot standardRobot = new StandardRobot();
        standardRobot.actionFly();
        
        LowRobot lowRobot = new LowRobot();
        lowRobot.actionKnife();
    }
}
