/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconcurrencia;

/**
 *
 * @author camper
 */
public class Testigo {
    private boolean enPosesion = false; // el testigo está libre para que lo tome algun atleta

    public synchronized void tomar() throws InterruptedException {
        while (enPosesion) {
            wait();
        }
        enPosesion = true;
    }

    public synchronized void soltar() {
        enPosesion = false;
        notify();
    }
}
