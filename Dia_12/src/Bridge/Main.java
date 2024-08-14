/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author Jorge Mozo
 */
public class Main {
    public static void main(String[] args) {
    // Control remoto para la televisión
        Device tv = new Television();
        RemoteControl remote = new RemoteControl(tv) {};
        remote.togglePower();
        remote.volumeUp();
        remote.volumeDown();

        // Control remoto avanzado para la radio
        Device radio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.mute();    
    }
}
