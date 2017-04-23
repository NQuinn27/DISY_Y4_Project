package smarthome;

import java.io.*;
import org.omg.CORBA.*;
import SmartHomeModule.*;
import org.omg.CosNaming.* ;
import org.omg.CosNaming.NamingContextPackage.*;
import java.util.Properties;

public class SmartHomeServer {
	public static void main (String args[]) {
		try{
                    
                   Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49001");
                    ORB orb = ORB.init(args, props);

                    NameComponent nc[] = new NameComponent[1];

                    LivingRoomServant livingRoomRef = new LivingRoomServant();
                    BathroomServant bathroomRef = new BathroomServant();
                    KitchenServant kitchenRef = new KitchenServant();
                    
                    

                    //connecting the servant to the orb
                    orb.connect(livingRoomRef);
                    
                    //Locate Naming Service
                    org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
                    System.out.println("Found NameService.");

                    NamingContext rootCtx = NamingContextHelper.narrow(objRef);
                        
                    //Add living room to root
                    nc[0] = new NameComponent("Living Room Context", "Context");
                    NamingContext Ctx1 = rootCtx.bind_new_context(nc);
                    System.out.println("Context 'Living Room Context' added to Name Space.");
                        
                    //Add Living Room Service to Living Room Context
                    nc[0] = new NameComponent("Living Room Service", "Object");
                    //NameComponent path[] = {nc};
                    //Binding the name to an object that is stored in the Naming Context
                    Ctx1.rebind(nc, livingRoomRef);
                    System.out.println("Object '\"Living Room Service' added to Living Room Context.");
                        
                    //Add bathroom to root
                    nc[0] = new NameComponent("Bathroom Context", "Context");
                    NamingContext Ctx2 = rootCtx.bind_new_context(nc);
                    System.out.println("Context 'Bathroom Context' added to Name Space.");
                    
                     //Add Bathroom Service to Bathroom Context
                    nc[0] = new NameComponent("Bathroom Service", "Object");
                    //NameComponent path[] = {nc};
                    //Binding the name to an object that is stored in the Naming Context
                    Ctx2.rebind(nc, bathroomRef);
                    System.out.println("Object '\"Bathroom Service' added to BathRoom Context.");
                    
                     //Add Kitchen to root
                    nc[0] = new NameComponent("Kitchen Context", "Context");
                    NamingContext Ctx3 = rootCtx.bind_new_context(nc);
                    System.out.println("Context 'Kitchen Context' added to Name Space.");
                    
                     //Add Kitchen Service to Kitchen Context
                    nc[0] = new NameComponent("Kitchen Service", "Object");
                    //NameComponent path[] = {nc};
                    //Binding the name to an object that is stored in the Naming Context
                    Ctx3.rebind(nc, kitchenRef);
                    System.out.println("Object '\"Kitchen Service' added to Kitchen Context.");
                    
                    
                    
                    
                    // wait for invocations from clients
                    orb.run();
                        
                    System.out.println("Orb connected." + orb);
                } catch (Exception e) {
                    System.err.println("Error: "+e);
                    e.printStackTrace(System.out);
		}
	}
}
