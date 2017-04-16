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
public class Television extends Entity {
    
    private OnOffState state;
    private boolean recording;
    private int channel;
    
    public Television(String name) {
        super(name);
    }

    public OnOffState getState() {
        return state;
    }

    public void setState(OnOffState state) {
        this.state = state;
    }
    
    public void startRecording() {
        this.recording = true;
    }
    
    public void stopRecording() {
        this.recording = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }    
    
    public String statusString() {
        String recording = (this.recording) ? "recording" : "not recording";
        String channel = "" + this.getChannel();
        String state = this.getState() == OnOffState.ON ? "on" : "off";
        
        return "TV named " + this.getName() + " is " + state + ", it is on channel " + channel + " and it is " + recording + ".";
    }
}
