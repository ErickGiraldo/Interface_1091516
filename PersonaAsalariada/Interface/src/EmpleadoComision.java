
package Interfac;
public class EmpleadoComision {
 protected int sueldoFijo;
    protected double comicion;   
    public EmpleadoComision() 
    {        
        sueldoFijo=700000;
        comicion=(sueldoFijo*8/100);
    }
       
    public EmpleadoComision( int sueldoFijo, double comicion) 
    {
        this.sueldoFijo= sueldoFijo;
        this.comicion =comicion;
    }
    public int getSueldoFijo() 
    {
        return sueldoFijo;
    }
     public double getComicion() 
     {
        return comicion;
    }
    public void setSueldoFijo(int sueldoFijo)
    {
        this.sueldoFijo = sueldoFijo;
    }
    public void setComicion(double comicion) 
    {
        this.comicion = comicion;
    }   
    @Override
    public String toString() 
    {
        return "\nvalor comicion=" +comicion+ "\nsueldoFijo=" + sueldoFijo ;
    }
}