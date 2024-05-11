import javax.swing.JOptionPane;
public class BoletoBus3{
    int kmCosto, km;
    public void BolBus(int kmcosto, int km) {
            short  precio, edad;
            float desc, total;
            km=Byte.parseByte(JOptionPane.showInputDialog("¿Cuantos kilometros viajaras?"));
            edad=Byte.parseByte(JOptionPane.showInputDialog("¿Dime tu edad?"));
            precio=(short) (km*kmcosto);
            desc= (float) (precio*.30);
            total=precio-desc;
            if (edad>=60 || edad<=3) {
                System. out.println("El precio total es:" + total);
            }else{
                System. out.println("El costo total es:" + precio);
            }
            
            
    }
    
}

