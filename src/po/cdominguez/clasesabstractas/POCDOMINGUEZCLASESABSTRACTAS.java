/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po.cdominguez.clasesabstractas;

/**
 *
 * @author cat_dominguez
 */
public class POCDOMINGUEZCLASESABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle crcl1 = new Circle (3.5, "Rojo", false);
        System.out.println("CÍRCULO 1");
        System.out.println(crcl1);
        System.out.println();
        
        Rectangle rctngl1 = new Rectangle (6.3, 4.2, "Azul", false);
        System.out.println("RECTÁNGULO 1");
        System.out.println(rctngl1);
        
        Square sqr1 = new Square (5.1, 5.1, 5.1, "Verde", true);
        System.out.println("CUADRADO 1");
        System.out.println(sqr1);

    }
    
}
