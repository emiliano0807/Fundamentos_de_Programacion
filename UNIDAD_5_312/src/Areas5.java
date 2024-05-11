import javax.swing.JOptionPane;
public class Areas5 {
    public void Areas() {
        float area, b, l, a, D, d, r;
        double pi;
        String opcion;
        pi = 3.1416;
        area=0;
        opcion=JOptionPane.showInputDialog("Ingresa la figura a calcular: \n"
                + "Cuadrado\n"
                + "Rectangulo\n"
                + "Triangulo\n"
                + "Rombo\n"
                + "Circulo");
        switch (opcion){
            case "Cuadrado": 
                l=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de un lado"));
                area= l*l;
            break;
            case "Rectangulo": 
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la base"));
                a=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida de la altura"));
                area= b*a;
            break;
            case "Triangulo":
                b=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la base"));
                a=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la altura"));
                area= (b*a)/2;
            break;
            case "Rombo":
                D=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal mayor"));
                d=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal menor"));
                area= (D*d)/2;
            break;
            case "Circulo":
                r=Float.parseFloat(JOptionPane.showInputDialog("Ingresa la medida del radio"));
                area=pi (r*r);
            break;
            default:
                System.out.println("Figura no dentro de los parametros");
        }
        System.out.println("El area del " + opcion + " es: " + area);
    }

    private static float pi(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
