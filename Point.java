/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

/**
 *
 * @author BOBBY
 */
public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x =x;
        this.y=y;
    }
    
    public int getx () {
        return x;
    }
    
    public void setx (int x) {
        this.x = x;
    }
    
    public int gety () {
        return y;
    }
    public void sety (int y) {
       this.y = y;
    }
    
    /*public void deplace(int x, int y) {
        this.x += x;
        this.y += y;
    }*/
    
}
