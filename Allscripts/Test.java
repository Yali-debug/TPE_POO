/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author BOBBY
 */
public class Test {
        public static void main(String[] args) {
        //Point1 origin = new Point1 (0,0);
        Dessin d = new Dessin (6);
        d.addRectangle(new Rectangle (0, 0, 2, 2));
        d.addRectangle(new Rectangle (3, 3, 1, 1));
        d.addRectangle(new Rectangle (2, 5, 8, 1));
        Point p = new Point (4,5);
        System.out.println("la surface du dessin vaut " + d.surface());
        
        // Test exercice 1 et 2
        Rectangle sr1 = new Rectangle(p, 30, 40);
        SlantedRectangle sr = new SlantedRectangle(10, 20, 30, 40, 15);
        System.out.println("Avant translation : " + sr1);
        System.out.println("Avant translation : " + sr);
        sr.translate(5, -10);
        System.out.println("Après translation : " + sr);
        sr.rotate(45);
        System.out.println("Après rotation : " + sr);
        
        // TEST exercice 4 Analyse des appels
        
        
        // TODO code application logic here
    }
    
}
