import javax.swing.JOptionPane;
public class TiendaDeDescuento4{
    double desc1, desc2;
    public void Tiendadesc(double desc1, double desc2){
        byte acum=0;
        float n;
        float desc;
        float to;
        byte col;
        String opcion;
        opcion=JOptionPane.showInputDialog("Saque la bolita y muestre el color a:\nRoja\nAmarilla\nBlanca" );
        switch (opcion){
            case"Roja": n=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el monto de tu compra"));
                desc = (float) (n*desc1);
                to = n-desc;
                System.out.println("Este es tu precio total a pagar"+to+"Usted obtuvo un descuento de"+desc);
                break;
            case"Amarilla":n=Float.parseFloat(JOptionPane.showInputDialog("Inrese el monto de su compra"));
                desc= (float) (n*desc2);
                to = n-desc;
                System.out.println("Este es tu precio total a pagar"+to+"Usted obtuvo un descuento de"+desc);
                break;
            case"Blanca": n=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de su compra"));
                    System.out.println("Usted no tiene descuento, su monto total a pagar es"+ n);
                    break;
            default: System.out.println("El valor ingresado no fue correcto");
      
        }    
    }
}

