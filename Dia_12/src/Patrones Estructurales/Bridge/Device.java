/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author jorgy
 */
public interface Device {
    void powerOn();
    void powerOff();
    void setVolume(int volume);
    int getVolume();
}
