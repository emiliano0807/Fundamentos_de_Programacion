package prueba;
//paqutes 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Semestre extends JFrame  {
    private JPanel navegacion2, botones2 ;
    private JLabel Semestre, Periodo, Materia;
    private JButton Continuar, Cancelar;
    private JComboBox Sem, Per, Mat;
    static private String semestres, periodos, materias;
    static String usuario2;
    
    //Constructor
    // u= Usuario
    public Semestre(String u){
         this.usuario2=u;
        Paso control= new Paso();
        Container contenedor=getContentPane();
        contenedor.setLayout(new BorderLayout());
        navegacion2=new JPanel(new GridLayout(3,2));
        botones2=new JPanel(new GridLayout(1,2));
        Semestre=new JLabel("Semestre");
        Materia=new JLabel("Materia");
        Periodo=new JLabel("Periodo");
        Sem=new JComboBox();
        Sem.setModel(new DefaultComboBoxModel(new String[]{"Seleccionar","1 Semestre", 
        "2 Semestre","3 Semestre", "4 Semestre", "5 Semestre","6 Semestre", "7 Semestre",
        "8 Semestre", "9 Semestre" }));
        Per=new JComboBox();
        Per.setModel(new DefaultComboBoxModel(new String[]{"Seleccionar","1", "2", "3"}));
        Mat=new JComboBox();
        Mat.setModel(new DefaultComboBoxModel(new String[]{"Seleccionar","Calculo Integral",
            "Algebra Lineal", "Fisica General", "POO", "Probabilidad y Estadistica", "Taller"}));
        Continuar=new JButton("ACEPTAR");
        Continuar.addActionListener(control);
        Cancelar=new JButton("CANCELAR");
        Cancelar.addActionListener(control);
       
        //Ejecutar Objetos
        setTitle("Seleccion Semestre");
        
        navegacion2.add(Semestre);
        navegacion2.add(Sem);
        navegacion2.add(Periodo);
        navegacion2.add(Per);
        navegacion2.add(Materia);
        navegacion2.add(Mat);
        botones2.add(Continuar);
        botones2.add(Cancelar);
        
        contenedor.add(navegacion2, BorderLayout.CENTER);
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
        
        contenedor.add(navegacion2, BorderLayout.CENTER);
        Semestre.setHorizontalAlignment(0);
        Periodo.setHorizontalAlignment(0);
        Materia.setHorizontalAlignment(0);

        contenedor.add(botones2, BorderLayout.SOUTH);
        Continuar.setHorizontalAlignment(0);
        Continuar.setForeground(Color.BLACK);
        Continuar.setBackground(Color.LIGHT_GRAY);
        Cancelar.setHorizontalAlignment(0);
        Cancelar.setForeground(Color.WHITE);
        Cancelar.setBackground(Color.RED);
        
        
    }
    
    
    public void aceptar() {
        String materias=(String) Mat.getSelectedItem();
        String periodos=(String) Per.getSelectedItem();
        String semestres=(String) Sem.getSelectedItem();
    try{    
    if(Sem.getSelectedIndex()>=1 && Per.getSelectedIndex()>=1 && Mat.getSelectedIndex()>=1){
    JOptionPane.showMessageDialog(this, "Datos guardados con exito");
    
    Calificaciones ventana3 = new  Calificaciones(materias, periodos, semestres,usuario2);
    ventana3.setVisible(true);
    this.dispose();
    
    }else if (Sem.getSelectedIndex()==0 || Per.getSelectedIndex()==0 || Mat.getSelectedIndex()==0){
    //JOptionPane.showMessageDialog(this, "Seleccione una Opcion");
    throw new Exception("Selecciona Una opcion ");
    
      }
     }catch(Exception z){
         JOptionPane.showMessageDialog(this, "Excepcion " + z.getMessage());
     }
    }
    public void cancelar(){
        try{
            if (Sem.getSelectedIndex()>=0 || Per.getSelectedIndex()>=0 || Mat.getSelectedIndex()>=0){
                Sem.setSelectedItem("Seleccionar");
                Mat.setSelectedItem("Seleccionar");
                Per.setSelectedItem("Seleccionar");
                throw new Exception ("salido con exito ");
            }
        
        
        }catch(Exception r){
            JOptionPane.showMessageDialog(this,"Informacion " + r.getMessage());
            
        }
    }
    /*public static void main(String[] args) {
        Semestre ventana = new Semestre();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/

    class  Paso implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent Fi) {
          if(Fi.getSource()== Continuar){
              aceptar();
          }
          if(Fi.getSource()== Cancelar){
              cancelar();
          }
              
        }
        
    }
    
}
