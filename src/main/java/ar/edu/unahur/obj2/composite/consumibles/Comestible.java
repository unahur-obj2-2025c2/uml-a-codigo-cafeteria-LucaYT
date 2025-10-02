package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Comestible extends Producto{
    protected Integer pesoGr;

    Comestible(String nombre, Double precioBase, Integer pesoGr){
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }

    @Override
    public Double costo() {                       
        return (precioBase + doCosto()) * pesoGr; //precio base mas el tipo (si tiene) multiplicado por pesoGramo
    }

    public abstract Double doCosto(); //esto lo responde cada tipo de comestible
}