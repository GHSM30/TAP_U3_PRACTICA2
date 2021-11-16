
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
public class HiloSemaforo2 extends Thread {
    
    Ventana ventana;
    HiloSemaforo1 semaforo1;

    public HiloSemaforo2(Ventana ventana) {
        this.ventana = ventana;
    }
    
    
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        while(true){
            try {
                
                
                
                
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSemaforo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
