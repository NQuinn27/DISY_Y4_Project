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
public class LivingRoomServant extends SmartHomeModule._LivingRoomImplBase {
    
    public String getLightStatus() {
        return "";
    }
    
    public String turnLightsOn() {
        return "Lights are now on";
    }
    
    public String turnLightsOff() {
        return "Lights are now off";
    }
    
    public String lockDoor() {
        return "Door is now locked";
    }
    
    public String unlockDoor() {
        return "Door is now unlocked";
    }
    
}
