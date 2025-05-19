package electricity.billing.system;
import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame implements Runnable{
    Thread t;
    public Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg")); //To represent img
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); //we cannot add image Image object directly in JLabel but we can add ImageIcon.
        JLabel image =   new JLabel(i3); 
        add(image); //we cannot add i1 directly into add() method. So I used JLabel.
        
        setVisible(true);
        
        int x = 1;
        for(int i=2; i<600; i+=4, x+=1){
            setSize(i+x, i); //FrameSize
            setLocation(700-((i+x)/2), 400-(i/2)); //frame position on screen.
            
            try{
                Thread.sleep(2);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        
        t = new Thread(this);
        t.start(); //start method internally calls run method. we cannot call run method directly.
        
        setVisible(true); //The frame is by default not visible so we make it visible.
    }
    public void run(){
        try{
            Thread.sleep(3000);
            setVisible(false);
            
            new Login();
            
            //login Frame
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
        
    }
    
}
