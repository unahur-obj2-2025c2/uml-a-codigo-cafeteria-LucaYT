package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Producto implements Consumible{
    protected String nombre;
    protected Double precioBase;

    Producto(String nombre, Double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
}
