/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author BOBBY
 */
public class SlantedRectangle extends Rectangle {
    private int angle;
    
    public SlantedRectangle (Point originGauche, int width, int height, int angle) {
        super (originGauche, width, height);
        this.angle = angle % 360;
    }
    
    public SlantedRectangle (int x, int y, int width, int height, int angle) {
        super (x, y, width, height);
        this.angle = angle % 360;
    }
    
    public SlantedRectangle (Point originGauche, int width, int height ) {
        this(originGauche, width, height,0);
    }
    
    public int getAngle() {
        return angle;
    }
    public void setAngle(int angle ) {
        this.angle = angle % 360;
    }
    
    public void rotate (int da) {
        angle += (angle + da) % 360;
    }
    @Override
    public String toString() {
        /*return  "SlantedRectangle x=" + getOriginGauche().getx() + ", y=" + getOriginGauche().gety() + 
                    ", largeur =" + getWidth() + ", hauteur=" + getHeight() + ", angle=" + angle + "dégré";*/
        return "SlantedRectangle " + super.toString() + ", angle  =" + angle+ ""; // EXERCICE 6 QUESTION 2
    }
    
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof SlantedRectangle)) return false; // Exercice 7 classe SlantedRectangle
        SlantedRectangle s = (SlantedRectangle)o;
        return super.equals(s) && angle == s.angle;
    }
}
