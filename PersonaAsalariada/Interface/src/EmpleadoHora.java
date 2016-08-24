package Interfac;

public class EmpleadoHora {    
    protected int valorHora;
    protected int horaTrabajada;   
    public EmpleadoHora() 
    {        
        valorHora=5000;
        horaTrabajada=8;
    }
       
    public EmpleadoHora( int valorHora, int horaTrabajada) 
    {
        this.horaTrabajada= horaTrabajada;
        this.valorHora = valorHora;
    }
    public int getValorHora() 
    {
        return valorHora;
    }
     public int getHoraTrabajada() 
     {
        return horaTrabajada;
    }
    public void setHoraTrabajada(int horaTrabajada)
    {
        this.horaTrabajada = horaTrabajada;
    }
    public void setValorHora(int valorHora) 
    {
        this.valorHora = valorHora;
    }   
    @Override
    public String toString() 
    {
        return "\nvalorHora=" +valorHora+ "\nhoraTrabajada=" + horaTrabajada ;
    }
}