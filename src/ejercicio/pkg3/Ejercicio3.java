
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
    static int hilo = 1;
    static int retardo = 15000;
    @Override
    public void run () {
        
        if (hilo < 3){
            new Ejercicio3 ("Hilo "+hilo) .start ();
            hilo++;
            retardo /= 3;  
            try {
                System.out.println(retardo);
                Thread.sleep(retardo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //metodo();
        System.out.println(getName());
    }
    
    public void metodo (){
        for (int i = 0; i < 5; i++){
            System.out.println("bucle "+this.getName());
        }
    }
    public static void main(String[] args) {
        new Ejercicio3 ("Hilo 0") .start ();
    }
    
}
