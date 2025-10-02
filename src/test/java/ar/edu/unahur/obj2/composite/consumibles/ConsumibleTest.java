package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConsumibleTest {

    @Test
    public void tostadoDeJamonYQuesoPrecioTotal150(){
        Tostado t = new Tostado("Tostado Jamón y Queso", 20.0, 5, tipoTostado.JAMON_Y_QUESO);
        assertEquals(150, t.costo());
        assertEquals(10, t.doCosto());
    }

    @Test
    public void medialunaMantecaPrecioTotal175(){
        Medialuna m = new Medialuna("Medialuna de Manteca", 20.0, 5, tipoMedialuna.DE_MANECA);
        assertEquals(175, m.costo());
        assertEquals(15, m.doCosto());
    }

    @Test
    public void cafeConLechePrecioTotal300(){
        Cafe c = new Cafe("Cafe con Leche", 50.0, 100, true);
        assertEquals(300, c.costo());
    }

    @Test
    public void comboDeTodoLoAnteriorDescuentoDel25PorcientoNoTeLoPodesPerder(){
        Cafe c = new Cafe("Cafe con Leche", 50.0, 100, true);
        Tostado t = new Tostado("Tostado Jamón y Queso", 20.0, 5, tipoTostado.JAMON_Y_QUESO);
        Medialuna m = new Medialuna("Medialuna de Manteca", 20.0, 5, tipoMedialuna.DE_MANECA);

        Combo manianero = new Combo("Combo Mañanero", null, 20.0);

        manianero.agregarProducto(c);
        manianero.agregarProducto(t);
        manianero.agregarProducto(m);

        assertEquals(483.75, manianero.costo());
    }
}
