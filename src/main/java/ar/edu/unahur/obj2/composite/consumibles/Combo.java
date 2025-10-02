package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible{
    private final String nombre;
    private final Double precioAdicional;
    private final List<Consumible> productos;

    public Combo(String nombre, List<Consumible> productos, Double precioAdicional) {
        this.nombre = nombre;
        this.precioAdicional = (precioAdicional != null) ? precioAdicional : 0.0;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Consumible c){
        productos.add(c);
    }

    public void eliminarProducto(Consumible c){
        productos.remove(c);
    }

    @Override
    public Double costo() {
        Double e = productos.stream().mapToDouble(p -> p.costo()).sum();
        return (e + precioAdicional) * 0.75;
    }

}
