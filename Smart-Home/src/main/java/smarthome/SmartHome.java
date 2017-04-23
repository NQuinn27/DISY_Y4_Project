/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthome;

import SmartHomeModule.Bathroom;
import SmartHomeModule.BathroomHelper;
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
import SmartHomeModule.Kitchen;
import SmartHomeModule.KitchenHelper;
import SmartHomeModule.Outdoors;
import SmartHomeModule.OutdoorsHelper;
/**
 *
 * @author niall
 */
public class SmartHome {
    public static NamingContextExt rootCtx;
    public static void main(String[] args) {
        // TODO create the GUI here
        // Temporary
        System.out.println("Main");
    }
     
    public static String livingRoomHandler(String method) {
        try {
            NameComponent nc[]= new NameComponent[2];    
            Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49001");
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
    
    public static String bathroomHandler(String method) {
        try {
            NameComponent nc[]= new NameComponent[2];    
            Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49001");
            ORB orb = ORB.init(new String[0], props);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            rootCtx = NamingContextExtHelper.narrow(objRef);
            
            nc[0] = new NameComponent("Bathroom Context", "Context");
            nc[1] = new NameComponent("Bathroom Service", "Object");
            
            org.omg.CORBA.Object objBathRoom = rootCtx.resolve(nc);
            Bathroom bathroom = BathroomHelper.narrow(objBathRoom);
            
            switch (method) {
                case "turnimmersionOff":
                    return bathroom.turnImmersionOff();
                case "turnimmersionOn":
                    return bathroom.turnImmersionOn();
                case "turnfanOn":
                    return bathroom.turnFanOn();
                case "turnfanOff":
                    return bathroom.turnFanOff();
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
    
    public static String kitchenHandler(String method) {
        try {
            NameComponent nc[]= new NameComponent[2];    
            Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49001");
            ORB orb = ORB.init(new String[0], props);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            rootCtx = NamingContextExtHelper.narrow(objRef);
            
            nc[0] = new NameComponent("Kitchen Context", "Context");
            nc[1] = new NameComponent("Kitchen Service", "Object");
            
            org.omg.CORBA.Object objKitchen = rootCtx.resolve(nc);
            Kitchen kitchen = KitchenHelper.narrow(objKitchen);
            
            switch (method) {
                case "turnboilerOff":
                    return kitchen.turnBoierOff();
                case "turnboilerOn":
                    return kitchen.turnBoilerOn();
                case "turnheatingOn":
                    return kitchen.turnHeatingOn();
                case "turnheatingOff":
                    return kitchen.turnHeatingOff();
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

public static String outDoorHandler(String method) {
        try {
            NameComponent nc[]= new NameComponent[2];    
            Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49001");
            ORB orb = ORB.init(new String[0], props);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            rootCtx = NamingContextExtHelper.narrow(objRef);
            
            nc[0] = new NameComponent("OutDoor Context", "Context");
            nc[1] = new NameComponent("OutDoor Service", "Object");
            
            org.omg.CORBA.Object objRefOutDoor = rootCtx.resolve(nc);
            Outdoors outdoor = OutdoorsHelper.narrow(objRefOutDoor);
            
            switch (method) {
                case "turnonoutDoorLights":
                    return outdoor.turnOnOutDoorLights();
                case "turnoffoutDoorLights":
                    return outdoor.turnOffOutDoorLights();
                case "lockgate":
                    return outdoor.lockGate();
                case "unlockgate":
                    return outdoor.unlockGate();
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