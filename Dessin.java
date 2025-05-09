/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author BOBBY
 */
public class Dessin {
    private Rectangle [] rectangles;
    private int count; // nombre actuel de rectangles ajoutés
    private Rectangle hullRect;
    
    public Dessin (int capacity) {
        if (capacity <0 ) {
            throw new IllegalArgumentException("La capacité doit être positive");
        }
        
        rectangles = new Rectangle [capacity];
        count =0;
    }
        
    //Ajout un rectangle au dessin
    public void addRectangle(Rectangle r) {
        if (count >= rectangles.length){
                throw new IllegalStateException ("Le dessin est plein");
        }
        
        rectangles [count] = r;
        count++;
        
        if (hullRect == null) {
            hullRect = new Rectangle(r.getOriginGauche().getx(), r.getOriginGauche().gety(), r.getWidth(), r.getHeight());
        } else {
            Rectangle[] temp = {hullRect, r};
            hullRect = Rectangle.hull(temp);
        }
    }
    
    public int surface () {
        int total = 0;
        for (int i=0; i< count; i++) {/* on utilise count car elle correspond
            au nombre de rectangle ajoutée*/
            total = rectangles[i].surface();
        }
        return total ; 
    }
    
    public void translate (int dx, int dy) {
        for (int i =0; i < count ; i++) {
            rectangles[i].translate(dx, dy);
        }
        
        // il faut recalculer le hullRect après la translation
        if (count>0) {
            hullRect = rectangles[0];
            for (int i =0; i<count; i++) {
                Rectangle [] temp = {hullRect,rectangles[i]};
                hullRect = Rectangle.hull(temp);
                
            }
        }
    }
    
    public Rectangle hull() {
        return hullRect;
    }
}
