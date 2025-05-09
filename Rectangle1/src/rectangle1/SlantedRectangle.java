
package rectangle1;

public class SlantedRectangle extends Rectangle {
    public double angle;
    
    public SlantedRectangle(int largeur, int hauteur, double angle) {
        super(largeur, hauteur);
        this.angle = angle;
    }
    
    @Override
    public String toString () {
        return super.toString() + "incliné à " + angle + " deg";
    }
    
    @Override
    public boolean contains(int x, int y) {
        return false;
    }
    
    @Override
    public String hull() {
        return "Hull du rectangle incliné à " + angle + "°";
    }
}