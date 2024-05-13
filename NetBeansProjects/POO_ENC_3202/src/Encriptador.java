//paqutes 
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//javax.swing
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Encriptador extends JFrame{
    //atributos
    private JTextField entrada;
    private  JLabel entradaLbl, salida, salidaCadena, titlo;
    private  JButton encriptar, desencriptar, salir, limpiar;
    private  JPanel central, name, buttons;

    //Constrictor
    public Encriptador(){
        Eventos manejador=new Eventos();
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        central=new JPanel(new GridLayout(3,2));
        name=new JPanel(new GridLayout(1,1));
        buttons=new JPanel(new GridLayout(1,2));
        salir=new JButton("Salida");
        salir.addActionListener(manejador);
        limpiar=new JButton("Limpiar");
        limpiar.addActionListener(manejador);
        entradaLbl=new JLabel("Texto a encriptar");
        entrada = new JTextField(10);
        salida=new JLabel ("ENCRIPTAR");
        salidaCadena=new JLabel ("DESENCRIPTAR");
        encriptar=new JButton ("ENCRIPTAR");
        encriptar.addActionListener(manejador);
        desencriptar=new JButton("DESENCRIPTAR");
        desencriptar.addActionListener(manejador);
        titlo=new JLabel ("ENCRIPTADOR");
        
       setTitle("Encriptador");
       name.add(titlo); 
       central.add(entradaLbl);
        central.add(entrada);
        central.add(encriptar);
        central.add(salida);
        central.add(desencriptar);
        central.add(salidaCadena);
        buttons.add(salir);
        buttons.add(limpiar);
        //Mostrar Cuadro de dialogo
        contenedor.add(central, BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
        
        // Mostrar Encabezado
        contenedor.add(name, BorderLayout.NORTH);
        titlo.setHorizontalAlignment(0);
        titlo.setForeground(Color.black);
        name.setBackground(Color.red);
        
        //Mostrar etiquetas y cuadro de texto 
        contenedor.add(central, BorderLayout.CENTER);
        entradaLbl.setHorizontalAlignment(0);
        salida.setHorizontalAlignment(0);
        salidaCadena.setHorizontalAlignment(0);
       
        //Mostrar Botones
        contenedor.add(buttons, BorderLayout.SOUTH);
        limpiar.setHorizontalAlignment(0);
        limpiar.setForeground(Color.LIGHT_GRAY);
        limpiar.setBackground(Color.BLACK);
        salir.setHorizontalAlignment(0);
        salir.setForeground(Color.LIGHT_GRAY);
        salir.setBackground(Color.BLACK);
        
    }//fin constrictor
    //Iniciar programacion de los botones
    public void Activar(){
        int l, i;
        String encriptador;
        char array[]=entrada.getText().toCharArray();
        l=array.length;
        for(i=0;i<l;i++){
            array[i]=(char)(array[i]+(char)l);
        }
        encriptador=String.valueOf(array);
        salida.setText(encriptador);   
    }
    public void Desactivar(){
        int i, l;
        String desencriptador;
        char array[]=salida.getText().toCharArray();
        l=array.length;
        for (i=0;i<l;i++){
        array[i]=(char)(array[i]-(char)l);
        }
        desencriptador=String.valueOf(array);
        salidaCadena.setText(desencriptador);  
    }
    public void salida(){
        System.exit(0);
    }    
    public void limpiar(){
        entrada.setText("");
        salida.setText("ENCRIPTAR");
        salidaCadena.setText("DESENCRIPTAR");
    }
    
    public static void main(String []args){
        Encriptador ventana = new Encriptador();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    class Eventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ev) {
        
            if(ev.getSource()== encriptar){
            Activar();
            }
            if(ev.getSource()==desencriptar){
            Desactivar();    
            }
            if(ev.getSource()==limpiar){
            limpiar();
            }
            if (ev.getSource()== salir){
                salida();
            }

        }
    }
}