package prueba;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
    //atributos
    int intentos;
    private JPanel navegacion1, botones1;
    private JTextField username;
    private JPasswordField password;
    private JLabel usuario, contraseña;
    private JButton aceptar, cancelar;
    //private String aUsuario="emilianorivfacio@gmail.com", aContraseña="Emilian0809";
    
    //Contructor
    public Login(){
        
        Evento control=new Evento();
        Container contenedor=getContentPane();
        contenedor.setLayout(new BorderLayout());  
        navegacion1=new JPanel(new GridLayout(2,2));
        botones1=new JPanel(new GridLayout(1,2));
        usuario=new JLabel("Usuario");
        username=new JTextField("");
        contraseña=new JLabel("Contraseña");
        password=new JPasswordField("");
        aceptar=new JButton("Aceptar");
        aceptar.addActionListener(control);
        cancelar=new JButton("Cancelar");
        cancelar.addActionListener(control);
        setTitle("Login");
        
        navegacion1.add(usuario);
        navegacion1.add(username);
        navegacion1.add(contraseña);
        navegacion1.add(password);
        botones1.add(aceptar);
        botones1.add(cancelar);
        
        contenedor.add(navegacion1, BorderLayout.CENTER);
        setSize(300,200);
        setVisible(true);
        setLocationRelativeTo(null);
        
        contenedor.add(navegacion1, BorderLayout.CENTER);
        usuario.setHorizontalAlignment(0);
        username.setHorizontalAlignment(0);
        contraseña.setHorizontalAlignment(0);
        password.setHorizontalAlignment(0);
         
        contenedor.add(botones1, BorderLayout.SOUTH);
        aceptar.setHorizontalAlignment(0);
        aceptar.setForeground(Color.BLACK);
        aceptar.setBackground(Color.LIGHT_GRAY);
        cancelar.setHorizontalAlignment(0);
        cancelar.setForeground(Color.WHITE);
        cancelar.setBackground(Color.RED);
  
    }  
        public void Ok(){
            String usuario2=(String) username.getText();
          String aUsuario=username.getText();
          String aContraseña=new String (password.getPassword());
         try{
          if(username.getText().isEmpty() && aContraseña.equals("")){
              /*JOptionPane.showMessageDialog(this, "Ingrese Usuario y Contraseña", "Usuario y/o contraseña Erronea", 
                  JOptionPane.ERROR_MESSAGE);*/
              username.requestFocus();
              throw new Exception("Ingrese Usuario Y contraseña");
             
          }else if(aUsuario.equals("Emiliano")&& 
                  aContraseña.equals("u12")){
              JOptionPane.showMessageDialog(this, "Acceso Correcto"); 
              
             Semestre Ventana2=new Semestre(usuario2);
             Ventana2.setVisible(true);
             this.dispose();
             
             
          }else if(intentos==2){
              JOptionPane.showMessageDialog(null, "Has exedido el numero de intentos", 
                      "Error, Intentalo Nuevamente", JOptionPane.ERROR_MESSAGE);
              System.exit(0);
              
          }else{
              
              JOptionPane.showMessageDialog(this, 
              "Los Datos no coinciden intenta nuevamente \n Quedan "+(2 - intentos)+ " intentos");
              username.setText("");
              password.setText("");
              username.requestFocus();
              intentos = intentos + 1;
          }
         
        }catch(Exception e){
             //JOptionPane.showMessageDialog(this, "Excepcion " + e.getMessage());
             System.out.println("Excepcion " + e.getMessage());
         } 
      }

        public void cancelar(){
            username.setText("");
            username.requestFocus();
            password.setText("");
        }
        public static void main(String []args){
        Login ventana = new Login();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      class Evento implements ActionListener{
      @Override
           public void actionPerformed(ActionEvent evto) {
               if(evto.getSource()==aceptar){
               Ok();    
               }
               if(evto.getSource()==cancelar){
                   cancelar();
               }
            
           }
            
      }
}
