package SmartHomeModule;


/**
* SmartHomeModule/OutdoorsOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 19 April 2017 16:50:38 o'clock IST
*/

public interface OutdoorsOperations 
{
  String getGardenLightStatus ();
  void setLightStatus ();
  void lockDoor ();
  void unlockDoor ();
  void openGate ();
  String closeGate ();
} // interface OutdoorsOperations