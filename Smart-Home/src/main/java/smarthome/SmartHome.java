/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthome;

import SmartHomeModule.LivingRoom;
import SmartHomeModule.LivingRoomHelper;
import java.util.Properties;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author niall
 */
public class SmartHome {
    public static NamingContextExt rootCtx;
    public static void main(String[] args) {
        // TODO create the GUI here
        // Temporary
    }
     
    public static String livingRoomHandler(String method) {
        try {
            NameComponent nc[]= new NameComponent[2];    
            Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49000");
            ORB orb = ORB.init(new String[0], props);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            rootCtx = NamingContextExtHelper.narrow(objRef);
            
            nc[0] = new NameComponent("Living Room Context", "Context");
            nc[1] = new NameComponent("Living Room Service", "Object");
            
            org.omg.CORBA.Object objRefLivingRoom = rootCtx.resolve(nc);
            LivingRoom livingRoom = LivingRoomHelper.narrow(objRefLivingRoom);
            
            switch (method) {
                case "turnLightsOff":
                    return livingRoom.turnLightsOff();
                case "turnLightsOn":
                    return livingRoom.turnLightsOn();
                case "lockDoor":
                    return livingRoom.lockDoor();
                case "unlockDoor":
                    return livingRoom.unlockDoor();
                default:
                    return "Unsupported Method";
            }
            
        } catch (NotFound e) {
            return "Not Found";
        } catch (CannotProceed e) {
            return "Cannot Proceed";
        } catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
            return "Invalid Name";
        } catch (InvalidName ex) {
            return "Invalid Name";
        }
    }
        
    
}
