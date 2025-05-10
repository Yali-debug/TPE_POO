/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

import java.util.Objects;

/**
 *
 * @author BOBBY
 */
public class Rectangle {
    private Point originGauche;
    private int height;
    private  int width;
    private static int nb =0;
    
    Rectangle (Point p1, Point p2) {
    int x = Math.min(p1.getx(), p2.getx());
    int y = Math.min(p1.gety(), p2.gety());
    this.originGauche = new Point (x,y);
    this.width = Math.abs (p2.getx()- p1.getx());
    this.height = Math.abs (p2.gety() - p1.gety());
    nb++;
    
    }
    
    Rectangle (Point p, int width, int height) {
        this.originGauche = new Point (p.getx(), p.gety());
        this.width = width;
        this.height =height;
        nb++;
    }
    
    Rectangle (int x1, int y1, int width, int height) {
        this.originGauche = new Point (x1, y1);
        this.width = width;
        this.height = height;
        nb++;
    }
    
    public int surface () {
     return width * height;
    }
    
    public void translate (int dx, int dy) {
        originGauche.setx(originGauche.getx() + dx);
        originGauche.sety(originGauche.gety() + dy);
    }
    // getters pour origin, width et height
    
   public Point getOriginGauche () {
       return originGauche;
   }
   public int getWidth () {
       return width;
   }
   
   public int getHeight () {
       return height;
   }
    
    public boolean contains (Point p) {
        return p.getx() >= originGauche.getx() && p.getx() <= originGauche.getx() + width &&
                p.gety()>= originGauche.gety() && p.gety() <=originGauche.gety() + height;
    }
    public boolean contains (Rectangle r) {
        Point upRight = new Point (r.originGauche.getx() + r.width, r.originGauche.gety() + r.height);
        return contains(r.originGauche) && contains (upRight);
    }
    
    public boolean sameAS (Rectangle r2) {
        return this.originGauche.getx() == r2.getOriginGauche().getx() && 
                this.originGauche.gety() == r2.getOriginGauche().gety() &&
                this.width == r2.getWidth() && this.height == r2.getHeight();
    }
    
    public static Rectangle hull (Rectangle [] rects){
        if (rects == null || rects.length == 0) {
            throw new IllegalArgumentException(" le tableau de rectangle est vide ! ");
        }
        int minX = rects[0].getOriginGauche().getx();
        int minY = rects[0].getOriginGauche().gety();
        int maxX = rects[0].getOriginGauche().getx() + rects[0].getWidth();
        int maxY = rects[0].getOriginGauche().gety() + rects[0].getHeight();
        
        for (int i= 0; i<rects.length; i++) {
            Rectangle r = rects[i];
            int rMinX = r.getOriginGauche().getx();
            int rMinY = r.getOriginGauche().gety();
            int rMaxX = r.getOriginGauche().getx() + r.getWidth();
            int rMaxY = r.getOriginGauche().gety() + r.getHeight();
            
            if (rMinX < minX) { minX = rMinX;}
            if (rMinY < minY) { minY = rMinY;}
            if (rMaxX > maxX) { maxX = rMaxX;}
            if (rMaxY > maxY) { maxY = rMaxY;}
             
        }
        return  new Rectangle(minX, minY, maxX-minX, maxY-minY);
    }
    
    @Override
    public String toString() {
        return "Rectangle x=" + originGauche.getx() + ", y=" + originGauche.gety() + //EXERCICE 6 QUESTION 1
                    ", largeur =" + getWidth() + ", hauteur=" + getHeight() + "";
    }
    @Override
    public boolean equals (Object o) {
        if (!(o instanceof Rectangle)) return false;
        Rectangle r = (Rectangle)o;
        return getOriginGauche().equals(r.getOriginGauche()) && getWidth() == r.getWidth() // EXERCICE 7 
                && getHeight() == r.getHeight();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.originGauche);
        hash = 73 * hash + this.height;
        hash = 73 * hash + this.width;
        return hash;
    }

    /**
     * @param args the command line arguments
     */   
}
