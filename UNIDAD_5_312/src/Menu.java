import javax.swing.JOptionPane;
public class Menu {
    public static void main (String[]args){
        String regresar;
        do{
        String op;
        op=JOptionPane.showInputDialog("Selecciona el codigo que desea ejecutar: \n"
                + "(1)Código que calcula el promedio de las unidades de la materia de quimica \n"
                + "(2)Código que calcula el precio total de las plumas \n"
                + "(3)Código que calcula el precio a pagar y el descuento que recibe la persona segun su edad \n"
                + "(4)Código que calcula el precio con descuento de un sorteo de una tienda segun la bolita \n "
                + "(5)Código que calcula el area de algunas figuras \n"
                + "(6)Código que calcula las calificaciones de la materia de FDP \n"
                + "(7)Código que ejecuta una multilicación con arreglos \n"
                + "(8)Código que calcula las calificaciones del primer semestre de ING EN SISTEMAS \n");
         switch(op){
             case "1":
                 PromedioQuim1 obj1=new PromedioQuim1 ();
                 obj1.PromQuim1();
                 break;
             case "2":
                 VendedorPlumas2 obj2=new VendedorPlumas2 ();
                 obj2.VendPlumas(10, 10);
                 break;
             case "3":
                 BoletoBus3 obj3=new BoletoBus3 ();
                 obj3.BolBus(100, 20);
                 break;
             case "4":
                 TiendaDeDescuento4 obj4=new TiendaDeDescuento4 ();
                 obj4.Tiendadesc(0.40, 0.25);
                 break;
             case"5":
                 Areas5 obj5=new Areas5 ();
                 obj5.Areas();
                 break;
             case"6":
                 CalFP obj8=new CalFP ();
                 obj8.CaliFDP();
                 break;
             case"7":                 
                 MultiAreglo2 obj9=new MultiAreglo2 ();
                 obj9.Arreglo2();
                 break;
             case"8":
                 ArregloBidi3 obj10=new ArregloBidi3 ();
                 obj10.Arreglo3();
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Opcion Invalida");  
         }
         regresar=JOptionPane.showInputDialog("Si desea abril nuevamente un codigo presione\n"
          + "Si o No");
        }while(regresar.equals("Si"));
        System.out.println("Gracias por la enseñanza");
    }
}
