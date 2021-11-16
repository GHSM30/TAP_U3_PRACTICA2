
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEMO0464
 */
public class Fondo extends Canvas {
    
    
    
    Ventana ventana;
    int con =-1;
    
    public void alto(){
        Graphics g = getGraphics();
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(247,0,0));  //rojo
        g2.fillOval(175, 8, 50, 50);
        g2.setColor(new Color(118,124,0));  //amarillo
        g2.fillOval(175, 62, 50, 50);
        g2.setColor(new Color(18,124,0));  //verde
        g2.fillOval(175, 115, 50, 50);
    }
    
    public void precausion(){
        Graphics g = getGraphics();
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(124,0,0));  //rojo
        g2.fillOval(175, 8, 50, 50);
        g2.setColor(new Color(247,237,0));  // amarillo
        g2.fillOval(175, 62, 50, 50);
        g2.setColor(new Color(18,124,0));  // verde
        g2.fillOval(175, 115, 50, 50);
    }
    
    public void adelante(){
        Graphics g = getGraphics();
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(124,0,0));  //rojo
        g2.fillOval(175, 8, 50, 50);
        g2.setColor(new Color(118,124,0));  // amarillo
        g2.fillOval(175, 62, 50, 50);
        g2.setColor(new Color(0,247,21));  // verde
        g2.fillOval(175, 115, 50, 50);
    }
    
    @Override
    public void paint(Graphics g){
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D)g;
        
        this.setBackground(Color.WHITE);
        g2.setColor(Color.GRAY);
        g2.fillRect(0, 175,700, 130);
        g2.fillRect(285, 0,130, 700);
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(10));
        
        g2.drawLine(0, 240, 60, 240);
        g2.drawLine(80, 240, 140, 240);
        g2.drawLine(160, 240, 220, 240);
        g2.drawLine(240, 240, 270, 240);
        
        g2.drawLine(640, 240, 700, 240);
        g2.drawLine(560, 240, 620, 240);
        g2.drawLine(480, 240, 540, 240);
        g2.drawLine(430, 240, 460, 240);
        
        //vertical
        g2.drawLine(350, 0, 350, 60);
        g2.drawLine(350, 80, 350, 140);
        g2.drawLine(350, 160, 350, 165);
        
        g2.drawLine(350, 480, 350, 420);
        g2.drawLine(350, 400, 350, 340);
        g2.drawLine(350, 320, 350, 315);
        
        g2.setColor(Color.ORANGE);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(281, 178, 281, 301);
        g2.drawLine(418, 178, 418, 301);
        g2.drawLine(281, 301, 418, 301);
        g2.drawLine(281, 178, 418, 178);
        
        //semaforo
        g2.setColor(Color.darkGray);
        g2.fillRect(150, 5, 100, 162);
        g2.fillRect(450, 310, 100, 162);
        
        g2.setColor(new Color(124,0,0));
        g2.fillOval(175, 8, 50, 50);
        g2.fillOval(475, 313, 50, 50);
        
        g2.setColor(new Color(118,124,0));
        g2.fillOval(175, 62, 50, 50);
        g2.fillOval(475, 367, 50, 50);
        
        g2.setColor(new Color(18,124,0));
        g2.fillOval(175, 115, 50, 50);
        g2.fillOval(475, 421, 50, 50);

        if(con == 0){
            alto();
        }
        
        if(con == 1){
            precausion();
        }
        
        if(con == 2){
            adelante();
        }
        
    }
    
    public void repintar(){
        repaint();
    }
    
    @Override
    public void update(Graphics g){
        paint(g);
    }
}
