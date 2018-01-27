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
public class Rectangle extends Shape{
    //Atributos
    protected double length;
    protected double width;
    
    //Métodos
    //Constructores
    public Rectangle(){
        super();
        this.length=0.0;
        this.width=0.0;
    }
    
    public Rectangle (double length, double width, String color, boolean filled){
        super (color, filled);
        this.length=length;
        this.width=width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setLength (double length){
        this.length=length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth (double width){
        this.width=width;
    }
    
    public double getArea() {
        return length * width ;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2) ;
    }

    public String toString() {
        String relleno;
        if (this.filled)relleno=" y está relleno\n"; else relleno=" y no está relleno\n";
        return "El rectángulo es color " + this.color + relleno + "Su área es " + getArea() + "\n" + "Su perímetro es " + getPerimeter() +"\n";
    }
}
