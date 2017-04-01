/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityclasses;
/**
 *
 * @author niall
 */
public class Light extends Entity {
    
    private OnOffState state;
    
    public Light(String name) {
        super(name);
        this.state = OnOffState.OFF;
    }

    public OnOffState getState() {
        return state;
    }

    public void setState(OnOffState state) {
        this.state = state;
    }   
    
    public String statusString() {
        String state = this.getState() == OnOffState.ON ? "on" : "off";
        
        return "Light named " + this.getName()  + " is " + state + ".";
    }
}
