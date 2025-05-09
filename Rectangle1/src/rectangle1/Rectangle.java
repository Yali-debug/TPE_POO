package rectangle1;

public class Rectangle {
    public int largeur;
    public int hauteur;
    
    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public int surface () {
        return largeur * hauteur;
    }
    
    public boolean contains(int x, int y)  {
        return x >= 0 && x <= largeur && y >= 0 && y <= hauteur; 
    }
    
    public String hull()  {
        return "Rectagle de coin (0,0) à (" + largeur + "," + hauteur + ")";
    }
    
    @Override
    public String toString() {
        return "rectangle de " + largeur + " x " + hauteur;
    }
}