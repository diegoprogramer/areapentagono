/*
codigo que halla el area de un pentagono..
 */
package areapentagono;
import java.util.*;
/**
 *
 * @author alexander
 */
public class AreaPentagono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec= new Scanner(System.in);
        double perimetro;
        double lado;
        double apotema;
        double area;
        
        System.out.println("Digite el lado del pentagono: ");
        lado=tec.nextDouble();
        //System.out.println("Digite el apotema del pentagono: ");
        apotema=lado/1.45;
        perimetro=lado*5;
        area=perimetro*apotema;
        System.out.println("el apotema del pentagono es: "+apotema);
        System.out.println("el area del pentagono es: "+area);
          
        
        
        
    }
    
}
