import javax.swing.JOptionPane;
public class PromedioQuim1 {
    public void PromQuim1(){
        byte a,b,c;
        int p;
        a=Byte.parseByte(JOptionPane.showInputDialog("Ingresa Calificacion 1"));
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa Calificacion 2"));
        c=Byte.parseByte(JOptionPane.showInputDialog("Ingresa Calificacion 3"));
        p = (a+b+c)/3;
        if (p >= 70){
            System.out.println("Aprobado" + p);}
        else {
            System.out.println("No Acreditado" + p);}                                              
    }
}
