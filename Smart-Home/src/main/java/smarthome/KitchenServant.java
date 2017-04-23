package smarthome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrey
 */
public class KitchenServant extends SmartHomeModule._KitchenImplBase{
 public String turnBoilerOn(){
        return "The Boiler is now On";
    }
    public String turnBoierOff(){
        return "The Boiler is now Off";
    }
    public String turnHeatingOn(){
        return "The Heating is now On!";
    }
    public String turnHeatingOff(){
        return "The Heating is now Off!";
    }   
    
}