package rectangle1;

import java.util.ArrayList;

public class Dessin {
    private ArrayList<Rectangle> formes;
    
    public Dessin() {
        formes = new ArrayList<>();
    } 
    
    public void ajouter(Rectangle r) {
        formes.add(r);
    }
    
    public void afficher() {
        for (Rectangle r : formes) {
            System.out.println(r);
            System.out.println("Surfce: " + r.surface());
            System.out.println("Hull: " + r.hull());
            System.out.println("Contains point (1,1) ? " + r.contains(1, 1));
        }
    }
}