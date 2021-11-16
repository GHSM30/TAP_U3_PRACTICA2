
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEMO0464
 */
public class HiloCarroID extends Thread {
    
    HiloSemaforo1 semaforo1;
    HiloSemaforo2 semaforo2;

    public HiloCarroID(HiloSemaforo1 semaforo1, HiloSemaforo2 semaforo2) {
        this.semaforo1 = semaforo1;
        this.semaforo2 = semaforo2;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
         while(true){
            
            try {
                sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSemaforo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
