package smarthome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.* ;
import org.omg.CosNaming.NamingContextPackage.*;
import java.util.Properties;

public class SmartHomeServer{
//TODO: Implement Server
	public static void main (String args[]) {
		try{
                    
                   Properties props = new Properties(); props.put("org.omg.CORBA.ORBInitialPort", "49000");
                    ORB orb = ORB.init(args, props);

                    NameComponent nc[] = new NameComponent[1];

                    LivingRoomServant livingRoomRef = new LivingRoomServant();

                    //connecting the servant to the orb
                    orb.connect(livingRoomRef);
                    
                    //Locate Naming Service
                    org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
                    System.out.println("Found NameService.");

                    NamingContext rootCtx = NamingContextHelper.narrow(objRef);
                        
                    //Add context 1 to root
                    nc[0] = new NameComponent("Living Room Context", "Context");
                    NamingContext Ctx1 = rootCtx.bind_new_context(nc);
                    System.out.println("Context 'Living Room Context' added to Name Space.");
                        
                    //Add Living Room Service to Living Room Context
                    nc[0] = new NameComponent("Living Room Service", "Object");
                    //NameComponent path[] = {nc};
                    //Binding the name to an object that is stored in the Naming Context
                    Ctx1.rebind(nc, livingRoomRef);
                    System.out.println("Object '\"Living Room Service' added to Living Room Context.");
                        
                    // wait for invocations from clients
                    orb.run();
                        
                    System.out.println("Orb connected." + orb);
                } catch (Exception e) {
                    System.err.println("Error: "+e);
                    e.printStackTrace(System.out);
		}

	}
}
