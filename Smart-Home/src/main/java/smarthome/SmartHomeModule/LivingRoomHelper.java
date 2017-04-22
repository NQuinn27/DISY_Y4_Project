package SmartHomeModule;


/**
* SmartHomeModule/LivingRoomHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 22 April 2017 12:00:58 o'clock IST
*/

abstract public class LivingRoomHelper
{
  private static String  _id = "IDL:SmartHomeModule/LivingRoom:1.0";

  public static void insert (org.omg.CORBA.Any a, SmartHomeModule.LivingRoom that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static SmartHomeModule.LivingRoom extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (SmartHomeModule.LivingRoomHelper.id (), "LivingRoom");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static SmartHomeModule.LivingRoom read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_LivingRoomStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, SmartHomeModule.LivingRoom value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static SmartHomeModule.LivingRoom narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SmartHomeModule.LivingRoom)
      return (SmartHomeModule.LivingRoom)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      SmartHomeModule._LivingRoomStub stub = new SmartHomeModule._LivingRoomStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static SmartHomeModule.LivingRoom unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SmartHomeModule.LivingRoom)
      return (SmartHomeModule.LivingRoom)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      SmartHomeModule._LivingRoomStub stub = new SmartHomeModule._LivingRoomStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
