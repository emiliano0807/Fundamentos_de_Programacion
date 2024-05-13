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
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class Autetincacion extends JFrame {
    //atributos
    private JTextField username;//Cuadro de texto
    private JPasswordField password;//Cuadro de texto tipo contraseña
    private JLabel usuario, contraseña;//Etiqueta
    private JButton aceptar, cancelar;//Botones
    private JPanel navegacion, botones ;//Panel
    private String aUsuario="emilianoriveraf100@gmail.com", aContraseña="Emiliano1234";
    
    //Contrsuctor
    public Autetincacion(){
        //Declarar Objetos
        Evento control=new Evento();
        Container contenedor=getContentPane();
        contenedor.setLayout(new BorderLayout());
        navegacion=new JPanel(new GridLayout(2,2));
        botones=new JPanel(new GridLayout(1,2));
        usuario=new JLabel("Usuario");
        username = new JTextField("");
        contraseña=new JLabel("Contraseña");
        password=new JPasswordField("");
        aceptar=new JButton("Aceptar");
        aceptar.addActionListener(control);
        cancelar=new JButton("Cancelar");
        cancelar.addActionListener(control);
        //"Ejecutar Objetos"
        setTitle("Iniciar Sesion");
        navegacion.add(usuario);
        navegacion.add(username);
        navegacion.add(contraseña);
        navegacion.add(password);
        botones.add(aceptar);
        botones.add(cancelar);
        
        contenedor.add(navegacion, BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
        
        contenedor.add(navegacion, BorderLayout.CENTER);
        usuario.setHorizontalAlignment(0);
        username.setHorizontalAlignment(0);
        contraseña.setHorizontalAlignment(0);
        password.setHorizontalAlignment(0);
        
        contenedor.add(botones, BorderLayout.SOUTH);
        aceptar.setHorizontalAlignment(0);
        aceptar.setForeground(Color.LIGHT_GRAY);
        aceptar.setBackground(Color.BLACK);
        cancelar.setHorizontalAlignment(0);
        cancelar.setForeground(Color.LIGHT_GRAY);
        cancelar.setBackground(Color.BLACK);
        
        
    }
    
        public void aceptar(){
          String aUsuario=username.getText();
          String aContraseña=new String (password.getPassword());
          if(aUsuario.equals("") || aContraseña.equals("")){
              JOptionPane.showMessageDialog(this, "Debe ingresar los campos", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
              
          }else if(aUsuario.equals("emilianoriveraf100@gmail.com")||aContraseña.equals("Emiliano1234")){
             JOptionPane.showMessageDialog(this, "Acceso Consedido"); 
             SeleccionDeSemestre Ventana2=new SeleccionDeSemestre();
             
             Ventana2.setVisible(true);
             this.dispose();
             
             
          }else{
              JOptionPane.showMessageDialog(this, "Los Datos no coinciden", "mensaje error",JOptionPane.ERROR_MESSAGE);
          }
              
              
        }
        public void cancelar(){
            username.setText("");
            password.setText("");
        }
        public static void main(String []args){
        Autetincacion ventana = new Autetincacion();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      class Evento implements ActionListener{
      @Override
           public void actionPerformed(ActionEvent evto) {
               if(evto.getSource()==aceptar){
               aceptar();    
               }
               if(evto.getSource()==cancelar){
                   cancelar();
               }
            
           }
            
      }
}