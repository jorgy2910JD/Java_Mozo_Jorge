/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author Jorge Mozo 
 */
public abstract class RemoteControl {
     protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        System.out.println("Cambiando el estado de encendido del dispositivo.");
        if (device.getVolume() <= 0) {
            device.powerOff();
        } else {
            device.powerOn();
        }
    }

    public void volumeUp() {
        int volume = device.getVolume();
        device.setVolume(volume + 10);
    }

    public void volumeDown() {
        int volume = device.getVolume();
        device.setVolume(volume - 10);
    } 
}
