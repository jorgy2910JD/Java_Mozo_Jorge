/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author jorgy
 */
public class Radio implements Device{
    private int volume = 50;

    @Override
    public void powerOn() {
        System.out.println("Radio encendida.");
    }

    @Override
    public void powerOff() {
        System.out.println("Radio apagada.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volumen de la radio ajustado a " + this.volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
