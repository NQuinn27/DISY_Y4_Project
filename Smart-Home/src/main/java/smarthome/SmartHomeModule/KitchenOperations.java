package SmartHomeModule;


/**
* SmartHomeModule/KitchenOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SmartHome.idl
* 16 April 2017 12:43:10 o'clock IST
*/

public interface KitchenOperations 
{
  String getLightStatus ();
  void lockDoor ();
  void unlockDoor ();
  void setTemp ();
  String getTemp ();
} // interface KitchenOperations
