package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Bebible extends Producto{

    protected Integer capacidadMl;

    Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }

    @Override
    public Double costo() {                       
        return (precioBase + doCosto()) * capacidadMl * 0.05; //precio base mas el tipo (si tiene) multiplicado por el 5% de capacidadMl
    }

    protected abstract Double doCosto();
}
