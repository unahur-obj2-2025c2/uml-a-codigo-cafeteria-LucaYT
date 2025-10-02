package ar.edu.unahur.obj2.composite.consumibles;

public class Medialuna extends Comestible{
    private tipoMedialuna tipo;

    Medialuna(String nombre, Double precioBase, Integer pesoGr, tipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        return switch(tipo){
            case tipoMedialuna.DE_GRASA -> 10.0;
            case tipoMedialuna.DE_MANECA -> 15.0;
            case tipoMedialuna.CON_DULCE_DE_LECHE -> 15.0;
            default -> 0.0;
        };
    }

}
