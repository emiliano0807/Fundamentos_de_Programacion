import javax.swing.JOptionPane;
public class MultiAreglo2 {
    public void Arreglo2(){
    byte i,h,j;
    byte Cuadro_uno []=new byte [5];
         for (i=0; i<5; i++){
         Cuadro_uno [i]=Byte.parseByte (JOptionPane.showInputDialog("Dame 5 numeros aleatorios"));
         System.out.print(" ");
         System.out.print(Cuadro_uno[i]+" ");
         }
    System.out.print("\n");
    byte Cuadro_dos []=new byte [5];
    for (h=0; h<5; h++){
         Cuadro_dos [h]=Byte.parseByte (JOptionPane.showInputDialog("Dame otros 5 numeros aleatorios"));
         System.out.print(" ");
         System.out.print(Cuadro_dos[h]+" ");
        }
    System.out.print("\n");
    int matriz_resul []=new int [5];
    for (i=0, h=4, j=0; j<5; j++, h--, i++ ){
        matriz_resul[j]= (int) (Cuadro_uno[i]*Cuadro_dos[h]);
        System.out.print(matriz_resul[j]+ "  ");
        
    }
    
// j= matriz resultante, h= matriz_dos, i=matriz_uno
     
       
        
     }
   
}