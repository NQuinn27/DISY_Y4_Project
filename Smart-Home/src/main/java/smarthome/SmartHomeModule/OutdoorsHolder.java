package SmartHomeModule;

/**
* SmartHomeModule/OutdoorsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 19 April 2017 16:50:38 o'clock IST
*/

public final class OutdoorsHolder implements org.omg.CORBA.portable.Streamable
{
  public SmartHomeModule.Outdoors value = null;

  public OutdoorsHolder ()
  {
  }

  public OutdoorsHolder (SmartHomeModule.Outdoors initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SmartHomeModule.OutdoorsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SmartHomeModule.OutdoorsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SmartHomeModule.OutdoorsHelper.type ();
  }

}
