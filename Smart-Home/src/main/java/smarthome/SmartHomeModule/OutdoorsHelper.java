package SmartHomeModule;


/**
* SmartHomeModule/OutdoorsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 22 April 2017 12:00:58 o'clock IST
*/

abstract public class OutdoorsHelper
{
  private static String  _id = "IDL:SmartHomeModule/Outdoors:1.0";

  public static void insert (org.omg.CORBA.Any a, SmartHomeModule.Outdoors that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static SmartHomeModule.Outdoors extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (SmartHomeModule.OutdoorsHelper.id (), "Outdoors");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static SmartHomeModule.Outdoors read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_OutdoorsStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, SmartHomeModule.Outdoors value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static SmartHomeModule.Outdoors narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SmartHomeModule.Outdoors)
      return (SmartHomeModule.Outdoors)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      SmartHomeModule._OutdoorsStub stub = new SmartHomeModule._OutdoorsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static SmartHomeModule.Outdoors unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SmartHomeModule.Outdoors)
      return (SmartHomeModule.Outdoors)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      SmartHomeModule._OutdoorsStub stub = new SmartHomeModule._OutdoorsStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
