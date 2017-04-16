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
public class DoorLock extends Entity {

    private enum LockState {
        LOCKED, UNLOCKED
    }
    
    private DoorLock.LockState lockState;
    
    public DoorLock(String name) {
        super(name);
    }
    
    public void lock() {
        this.lockState = LockState.LOCKED;
    }
    
    public void unLock() {
        this.lockState = LockState.UNLOCKED;
    }
    
    public String statusString() {
        String state = this.getLockState() == DoorLock.LockState.LOCKED ? "locked" : "unlocked";
        
        return "Door named " + this.getName()  + " is " + state + ".";
    }

    public LockState getLockState() {
        return lockState;
    }

    public void setLockState(LockState lockState) {
        this.lockState = lockState;
    }
    
}
