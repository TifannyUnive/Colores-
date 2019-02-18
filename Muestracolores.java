package muestracolores;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Muestracolores extends JFrame {
private JButton cambiaColor1;
   private Color color = Color.lightGray;
   private Container c;
   
   public Muestracolores()
   {
       super ("Utilizando JColorChooser"); //Titulo
       c =getContentPane();
       c.setLayout(new FlowLayout()); //fluir
       cambiaColor1 = new JButton("Cambia el color");
       cambiaColor1.addActionListener(
               new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                   color = JColorChooser.showDialog(Muestracolores.this,"Elija un color", color);
                   if(color==null){
                       color = Color.lightGray;
                   }
                   c.setBackground(color);
                   c.repaint();
               }
               }
       );
       c.add(cambiaColor1);
       setSize(400,130); //tamaño de pantalla
       show();
        }//fin MuestraColores
    
    public static void main(String[] args) {
         Muestracolores app = new Muestracolores();
        app.addWindowListener(
                new WindowAdapter(){
                    public void WindowClosing(WindowEvent e){
                        System.exit(0);
                    }//fin windowClosing
                }
        );
    }//Fin main   
}//fin clase MuestraColores

