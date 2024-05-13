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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class RegistroDeCalificaciones extends JFrame {
    private JPanel navegacion3, botones3 ;//Panel
    private JLabel Unidad, Calif;//Etiqueta
    private JTextField Calificacion;
    private JButton guardar, cancelar;//Botones
    private JComboBox Unid;//Cuadro de opciones
    
    public RegistroDeCalificaciones(){
        Container contenedor=getContentPane();
        contenedor.setLayout(new BorderLayout());
        
    }
    
}
