package prueba;
//paqutes 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calificaciones extends JFrame implements Interface {
    private JPanel navegacion3, botones3;
    private JLabel Unidad1,Unidad2, Unidad3, Unidad4,Unidad5,
            Unidad6;
    private JTextField  unidad1, unidad2, unidad3, unidad4,unidad5,
            unidad6;//cuadro de texto para Ingresar Calificacion
    private JButton guardar, cancelar;
    static String usuario2, materias, semestres, periodos;
    //Constructor
// m= Materia, s= Semestre, p= periodo, u= usuario
    public Calificaciones(String m, String S, String P, String u) {
        //Declarar Objetos
        this.usuario2=u;
        this.materias=m;
        this.semestres=S;
        this.periodos=P;
        Evento Guardar = new Evento();
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        navegacion3 = new JPanel(new GridLayout(3, 4));
        botones3 = new JPanel(new GridLayout(1, 2));
        Unidad1 = new JLabel("Unidad1");
        unidad1=new JTextField("");
        
        Unidad2=new JLabel("Unidad2");
        unidad2=new JTextField("");
        
        Unidad3=new JLabel("Unidad3");
        unidad3=new JTextField("");
        
        Unidad4=new JLabel("Unidad4");
        unidad4=new JTextField("");
        
        Unidad5=new JLabel("Unidad5");
        unidad5=new JTextField("");
        
        Unidad6=new JLabel("Unidad6");
        unidad6=new JTextField("");
        
        guardar = new JButton("Guardar");
        guardar.addActionListener(Guardar);
        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(Guardar);

        setTitle("Registro de Calificaciones");
        navegacion3.add(Unidad1);
        navegacion3.add(unidad1);
        
        navegacion3.add(Unidad2);
        navegacion3.add(unidad2);
        
        navegacion3.add(Unidad3);
        navegacion3.add(unidad3);
        
        navegacion3.add(Unidad4);
        navegacion3.add(unidad4);
        
        navegacion3.add(Unidad5);
        navegacion3.add(unidad5);
        
        navegacion3.add(Unidad6);
        navegacion3.add(unidad6);
        
        botones3.add(guardar);
        botones3.add(cancelar);

        contenedor.add(navegacion3, BorderLayout.CENTER);
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);

        contenedor.add(navegacion3, BorderLayout.CENTER);
        Unidad1.setHorizontalAlignment(0);
        unidad1.setHorizontalAlignment(0);
        Unidad2.setHorizontalAlignment(0);
        unidad2.setHorizontalAlignment(0);
        Unidad3.setHorizontalAlignment(0);
        unidad3.setHorizontalAlignment(0);
        Unidad4.setHorizontalAlignment(0);
        unidad4.setHorizontalAlignment(0);
        Unidad5.setHorizontalAlignment(0);
        unidad5.setHorizontalAlignment(0);
        Unidad6.setHorizontalAlignment(0);
        unidad6.setHorizontalAlignment(0);
        
        
        contenedor.add(botones3, BorderLayout.SOUTH);
        guardar.setHorizontalAlignment(0);
        guardar.setForeground(Color.BLACK);
        guardar.setBackground(Color.LIGHT_GRAY);
        cancelar.setHorizontalAlignment(0);
        cancelar.setForeground(Color.WHITE);
        cancelar.setBackground(Color.RED);
    }
    public boolean validacion(String Calificaciones) {
        return Calificaciones.matches("[0-9]{1,3}");
    }


    

    @Override
    public void Guardar(){
        try {
            if( validacion(unidad1.getText())|| validacion(unidad2.getText())
                    || validacion(unidad3.getText())||validacion(unidad4.getText())
                    ||validacion(unidad5.getText())||validacion(unidad6.getText())){
                JOptionPane.showMessageDialog(this, "Guardado Con Exito");
                
                Impresion();
                unidad1.setText("");
                unidad2.setText("");
                unidad3.setText("");
                unidad4.setText("");
                unidad5.setText("");
                unidad6.setText("");
                unidad1.requestFocus();
                //System.exit(0);
            }else{
                JOptionPane.showMessageDialog(this, "Datos Incorrectos");
                throw new NumberFormatException("Ingrese Numeros");

            }
        }catch (NumberFormatException u){
            System.out.print("El formato no es el correcto seleccionar cualquier"
                    + " opcion "+u);
            
        }

    }
        public void Impresion(){
        try{
            String URL="Calificaciones.txt";
            File Historial= new File(URL);
            if(!Historial.exists()){
                Historial.createNewFile();
            }
            PrintWriter Folder= new PrintWriter(Historial);
            
            Folder.println("Nombre y/o Usuario " +usuario2);
            Folder.println("Semestre " +semestres);
            Folder.println("Materia " +materias);
            Folder.println("Periodo " +periodos);
            Folder.println("Unidad 1 " +unidad1.getText());
            Folder.println("Unidad 2 " +unidad2.getText());
            Folder.println("Unidad 3 " +unidad3.getText());
            Folder.println("Unidad 4 " +unidad4.getText());
            Folder.println("Unidad 5 " +unidad5.getText());
            Folder.println("Unidad 6 " +unidad6.getText());

            Folder.close();
            System.out.println("Creado con exito");
            
            
        }catch(IOException m){
            System.out.println("Error "+ m);   
            
        }
    }

    


    @Override
    public void cancelar() {
        unidad1.setText("");
        unidad2.setText("");
        unidad3.setText("");
        unidad4.setText("");
        unidad5.setText("");
        unidad6.setText("");
        System.exit(0);
    }

   /* public static void main(String[] args) {
        Calificaciones ventana = new Calificaciones( usuario2, semestres,  materias,  periodos);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/

    class Evento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource() == guardar) {
                Guardar();

            }
            if (ev.getSource() == cancelar) {
                cancelar();
            }
        }
    }
}
