/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author jorgy
 */
public class Television  implements Device{
    private int volume = 30;

    @Override
    public void powerOn() {
        System.out.println("Televisión encendida.");
    }

    @Override
    public void powerOff() {
        System.out.println("Televisión apagada.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volumen de la televisión ajustado a " + this.volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
