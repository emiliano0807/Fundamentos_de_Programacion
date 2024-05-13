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
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class SeleccionDeSemestre extends JFrame {
    private JPanel navegacion2, botones2 ;//Panel
    private JLabel Semestre, Periodo, Materia;//Etiqueta
    private JButton aceptar, cancelar;//Botones
    private JComboBox Sem, Per, Mat;//Cuadro de opciones
    //Constructor
    public SeleccionDeSemestre(){
        Container contenedor=getContentPane();
        contenedor.setLayout(new BorderLayout());
        navegacion2=new JPanel(new GridLayout(3,2));
        botones2=new JPanel(new GridLayout(1,2));
        Semestre=new JLabel("Semestre");
        Periodo=new JLabel("Periodo");
        Materia=new JLabel("Materia");
        Sem=new JComboBox();
        Sem.setModel(new DefaultComboBoxModel(new String[]{"1 Semestre", 
        "2 Semestre","3 Semestre", "4 Semestre", "5 Semestre","6 Semestre" }));
        Per=new JComboBox();
        Per.setModel(new DefaultComboBoxModel(new String[]{"2022", "2023"}));
        Mat=new JComboBox();
        Mat.setModel(new DefaultComboBoxModel(new String[]{"Calculo Integral",
            "Algebra Lineal", "Fisica General", "POO", "Probabilidad y Estadistica"}));
        aceptar=new JButton("ACEPTAR");
        cancelar=new JButton("CANCELAR");
        //Ejecutar Objetos
        setTitle("Seleccion Semestre");
        navegacion2.add(Semestre);
        navegacion2.add(Periodo);
        navegacion2.add(Materia);
        navegacion2.add(Sem);
        navegacion2.add(Mat);
        navegacion2.add(Per);
        botones2.add(aceptar);
        botones2.add(cancelar);
        
        
        contenedor.add(navegacion2, BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
        
        contenedor.add(navegacion2, BorderLayout.CENTER);
        Semestre.setHorizontalAlignment(0);
        Periodo.setHorizontalAlignment(0);
        Materia.setHorizontalAlignment(0);
        
        
        
        
        
        contenedor.add(botones2, BorderLayout.SOUTH);
        aceptar.setHorizontalAlignment(0);
        aceptar.setForeground(Color.LIGHT_GRAY);
        aceptar.setBackground(Color.BLACK);
        cancelar.setHorizontalAlignment(0);
        cancelar.setForeground(Color.LIGHT_GRAY);
        cancelar.setBackground(Color.BLACK);
        
        
    }
    
}
