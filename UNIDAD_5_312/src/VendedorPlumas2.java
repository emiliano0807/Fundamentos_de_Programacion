import javax.swing. JOptionPane; 
class VendedorPlumas2 {
    int precio_p, x;
    public void VendPlumas(int precio_p, int x){
    System. out.println("el costo de la pluma es " + precio_p);
    short  pagar;
    float desc, descontar;
    //x=Byte.parseByte(JOptionPane.showInputDialog("cuantas deceas comprar"));
    pagar= (short) (x*precio_p);
    descontar=(float) (pagar*0.05);
    desc=(pagar-descontar);
    System. out.println("El total es: " + pagar);
    System. out. println("Tu descuento es de:" + descontar);
    System. out.println("El total final es:"+ desc);
    
}
    
}