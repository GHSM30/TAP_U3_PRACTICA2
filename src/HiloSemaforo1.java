
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
public class HiloSemaforo1 extends Thread{
    
    Ventana ventana;
    Fondo luz = new Fondo();
    
    
    
    public HiloSemaforo1(Ventana ventana) {
        this.ventana = ventana;
    }
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        while(true){
            
            try {
                luz.con++;
                
                
                System.out.print("Contador: "+luz.con+"\n");
                if(luz.con == 2){
                    luz.con = -1;
                }
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSemaforo1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }    
    }
}
