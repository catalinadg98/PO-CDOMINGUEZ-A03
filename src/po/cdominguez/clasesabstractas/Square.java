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
public class Square extends Rectangle{
    //Atributos
    protected double side;
    
    //Métodos
    //Constructor
    public Square(){
        super ();
        this.side=0.0;
    }
    
    public Square (double side, double length, double width, String color, boolean filled){
        super (length, width, color, filled);
        this.side = side;
    }
    
    public double getSide(){
        return this.side;
    }
    
    public void setSide(double side){
        this.side = side;
    }
    
    public void setLength (double side){
        this.length=side;
    }
    
    public void setWidth (double side){
        this.width=side;
    }
    
    public String toString() {
        String relleno;
        if (this.filled)relleno=" y está relleno\n"; else relleno=" y no está relleno\n";
        return "El cuadrado es color " + this.color + relleno + "Su área es " + getArea() + "\n" + "Su perímetro es " + getPerimeter();
    }
}
