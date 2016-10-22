
package ejercicio.pkg3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gallegomanuel88
 */
public class Ejercicio3 extends Thread{

    public Ejercicio3 (String str){
        super (str);
    }
    static int hilo = 0;
    static int retardo = 15000;
    @Override
    public void run () {
        /** No se cumple el tiempo.
        if (hilo < 3){
            hilo++;
            retardo-=3000; 
            new Ejercicio3 ("Hilo "+hilo) .start ();
            try {
                System.out.println(retardo);
                Thread.sleep(retardo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
        */
        
        System.out.println(getName()+" comenzado");
        
        if (hilo == 0){
            hilo++;
            new Ejercicio3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(31000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 1){
            hilo++;
            new Ejercicio3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(25000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 2){
            hilo++;
            new Ejercicio3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(19000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 3){
            hilo++;
            new Ejercicio3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(13000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 4){
            hilo++;
            new Ejercicio3 ("Hilo "+hilo) .start ();
            try {
                Thread.sleep(7000);
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (hilo == 5){
            hilo++;
            try {
                metodo();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        System.out.println(getName()+" terminado");
    }
    /**
     * Metodo que lanza 10 veces un sleep entre 100 y 600 milisegundos aleatoriamente
     * @throws InterruptedException 
     */
    public void metodo () throws InterruptedException{
        for (int i = 0; i < 9; i++){
            int tiempoAleatorio = (int) Math.floor(Math.random()*600+100);
            Thread.sleep(tiempoAleatorio);
            System.out.println("bucle "+this.getName());
        }
    }
    public static void main(String[] args) {
        new Ejercicio3 ("Hilo "+hilo) .start ();
    }
    
}
