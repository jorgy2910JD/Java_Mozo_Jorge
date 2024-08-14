/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author jorgy
 */
public class AdvancedRemoteControl extends RemoteControl {
     public AdvancedRemoteControl(Device device) {
        super(device);
    }
    public void mute() {
        System.out.println("Silenciando el dispositivo.");
        device.setVolume(0);
    }
}
