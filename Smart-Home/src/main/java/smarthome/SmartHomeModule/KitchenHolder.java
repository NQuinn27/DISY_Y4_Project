package SmartHomeModule;

/**
* SmartHomeModule/KitchenHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 22 April 2017 12:00:58 o'clock IST
*/

public final class KitchenHolder implements org.omg.CORBA.portable.Streamable
{
  public SmartHomeModule.Kitchen value = null;

  public KitchenHolder ()
  {
  }

  public KitchenHolder (SmartHomeModule.Kitchen initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SmartHomeModule.KitchenHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SmartHomeModule.KitchenHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SmartHomeModule.KitchenHelper.type ();
  }

}
