import javax.swing.JOptionPane;
public class CalFP {
    public void CaliFDP(){
        byte  calificacion;
        float prom = 0;
        byte i;
        byte calif []=new byte[5];
        String nom[]={"U1", "U2", "U3", "U4", "U5"};
        for (i=0; i<5; i++){
            calif[i]=Byte.parseByte(JOptionPane.showInputDialog("Dame la calificacion de la"+nom[i]));
            prom+=calif[i];
            System.out.print(nom[i]+ "   ");
            System.out.print(" ");
        }                        
        calificacion=(byte) (prom/i);
        
        System.out.println("prom");
        for(i=0; i<5; i++){
            System.out.print(calif[i]+"    ");
            System.out.print("");
        }
        System.out.println(calificacion);
    }
}