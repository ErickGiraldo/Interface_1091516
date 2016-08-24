
package Interfac;
public class persona {
   
    protected String nombre;
    protected int edad;
    protected String  documento;

    public persona() 
    {
        
        nombre="Pepe";
        edad=20;
        documento="123456789";
    }
       
    public persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() 
    {
        return "Clase= "+this.getClass() + "\nNombre=" + nombre + "\nEdad=" + edad 
                + "\nDocumento=" + documento;
    }}