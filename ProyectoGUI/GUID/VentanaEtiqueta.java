package gui;
import javax.swing.*; 
class VentanaEtiqueta extends JFrame{
//El atributo de instancia es un objeto gráfico
    JLabel etiqueta;
//Constructor
    public VentanaEtiqueta(){        
      setSize(100, 120);
      etiqueta= new JLabel("Hola!");
      getContentPane().add(etiqueta); 
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
