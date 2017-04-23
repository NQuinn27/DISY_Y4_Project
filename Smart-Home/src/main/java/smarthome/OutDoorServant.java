
package smarthome;

public class OutDoorServant extends SmartHomeModule._OutdoorsImplBase {
    
    
    public String turnOnOutDoorLights() {
        return "Lights are now on";
    }
    
    public String turnOffOutDoorLights() {
        return "Lights are now off";
    }
    
    public String lockGate() {
        return "Gate is now locked";
    }
    
    public String unlockGate() {
        return "Gate is now unlocked";
    }
    
}
