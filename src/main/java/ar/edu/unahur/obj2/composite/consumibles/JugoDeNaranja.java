package ar.edu.unahur.obj2.composite.consumibles;

public class JugoDeNaranja extends Bebible{

    JugoDeNaranja(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase, capacidadMl);
    }

    @Override
    protected Double doCosto() {
        return 0.0;
    }
    
}
