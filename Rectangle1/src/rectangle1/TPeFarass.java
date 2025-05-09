package rectangle1;
        
public class TPeFarass {
    public static void main(String[] args) {
        Dessin d = new Dessin();
        
        Rectangle r1 = new Rectangle(5, 3);
        SlantedRectangle r2 = new SlantedRectangle(4, 2, 30);
        
        d.ajouter(r1);
        d.ajouter(r2);
        
        d.afficher();
    }
}