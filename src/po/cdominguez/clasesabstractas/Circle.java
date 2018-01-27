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
public class Circle extends Shape{
    //Atributos
    protected double radious;
    
    //Métodos
    //Constructores
    public Circle(){
        super();
        this.radious=0.0;
    }
    
    public Circle (double radious, String color, boolean filled){
        super(color, filled);
        this.radious=radious;
    }
    
    public double getRadious(){
        return this.radious;
    }
    
    public void setRadious(double radious){
        this.radious=radious;
    }

    public double getArea() {
        return 3.1416 * Math.pow(this.radious,2);
    }

    public double getPerimeter() {
        return 3.1416 * (this.radious * 2);
    }

    public String toString() {
        String relleno;
        if (this.filled)relleno=" y está relleno\n"; else relleno=" y no está relleno\n";
        return "El círculo es color " + this.color + relleno + "Su área es " + getArea() + "\n" + "Su perímetro es " + getPerimeter();
    }
    
    
    
}
