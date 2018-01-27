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
public abstract class Shape {
    //Atributos
    protected String color;
    protected boolean filled;
    
    //Métodos
    public Shape(){
        color="";
        filled=false;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    
}
