/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthome;

/**
 *
 * @author niall
 */
public class BathroomServant extends SmartHomeModule._BathroomImplBase {
    public String turnImmersionOn(){
        return "The Immersion is now On";
    }
    public String turnImmersionOff(){
        return "The Immersion is now Off";
    }
    public String turnFanOn(){
        return "The Fan is now On!";
    }
    public String turnFanOff(){
        return "The Fan is now Off!";
    }
}
