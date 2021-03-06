package SmartHomeModule;


/**
* SmartHomeModule/_KitchenImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 23 April 2017 22:27:29 o'clock IST
*/

public abstract class _KitchenImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements SmartHomeModule.Kitchen, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _KitchenImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("turnBoilerOn", new java.lang.Integer (0));
    _methods.put ("turnBoierOff", new java.lang.Integer (1));
    _methods.put ("turnHeatingOn", new java.lang.Integer (2));
    _methods.put ("turnHeatingOff", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // SmartHomeModule/Kitchen/turnBoilerOn
       {
         String $result = null;
         $result = this.turnBoilerOn ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // SmartHomeModule/Kitchen/turnBoierOff
       {
         String $result = null;
         $result = this.turnBoierOff ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // SmartHomeModule/Kitchen/turnHeatingOn
       {
         String $result = null;
         $result = this.turnHeatingOn ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // SmartHomeModule/Kitchen/turnHeatingOff
       {
         String $result = null;
         $result = this.turnHeatingOff ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SmartHomeModule/Kitchen:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _KitchenImplBase
