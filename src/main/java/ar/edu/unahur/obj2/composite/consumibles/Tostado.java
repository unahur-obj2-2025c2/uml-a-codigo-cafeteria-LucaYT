package ar.edu.unahur.obj2.composite.consumibles;

public class Tostado extends Comestible{
    private tipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, tipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        return switch (tipo) {
            case tipoTostado.JAMON_Y_QUESO -> 10.0;
            case tipoTostado.SALAME_Y_QUESO -> 20.0;
            default -> 0.0;
        };
    }
    
    
}
