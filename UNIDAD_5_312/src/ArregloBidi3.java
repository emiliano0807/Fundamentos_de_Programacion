import javax.swing.JOptionPane;
public class ArregloBidi3 {
public void Arreglo3(){
                String materias[]= {"Matematicas Discretas", "Calculo Diferencial", "Fundam Investigacion", "Quimica", "Desarrollo Sustentable", "Fundam Programacion"};
                String unidades[]= {"U1", "U2", "U3", "U4", "U5"};
                float prom, sumpro, sumpros;
                byte a, b, i;
                short acumcalif[][]= new short[6][5];
                prom=0;
                for(a=0; a<6; a++){
                    for(b=0; b<5; b++){
                        acumcalif[a][b]=Short.parseShort(JOptionPane.showInputDialog("Ingresa la calificacion" + materias[a] + "de la materia" + unidades[b]));                
                       }
                }
               for(b=0, a=0; b<5; b++, a++) {  
                    System.out.print(unidades[b] + "  " );
                  }
            System.out.print("Promedio\n");
            sumpro=0;
            i=0;
            sumpros=0;
            for(a=0; a<6; a++){
                    for(b=0; b<5; b++){
                        prom+= acumcalif[a][b];
                        sumpro= prom/5;
                        System.out.print(acumcalif[a][b] + "   ");
                       }
                i+=sumpro;
                prom=0;
                sumpros= i/6;
                     System.out.print(sumpro + "   ");
                     System.out.print(materias[a] + "\n" );
                }
              System.out.println("TU PROMEDIO SEMESTRAL ES DE: " + sumpros);
               }
            }
