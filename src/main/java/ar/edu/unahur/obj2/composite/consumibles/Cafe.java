package ar.edu.unahur.obj2.composite.consumibles;

public class Cafe extends Bebible{
    private boolean conLeche;

    Cafe(String nombre, Double precioBase, Integer capacidadMl, boolean conLeche) {
        super(nombre, precioBase, capacidadMl);
        this.conLeche = conLeche;
    }

    @Override
    protected Double doCosto() {
        if (conLeche) {
            return 10.0;
        }
        return 0.0;
    }


}
