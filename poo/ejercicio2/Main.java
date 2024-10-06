package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Movimiento m = new Movimiento();

        System.out.println(m.getCooerdenadas());

        m.abajo();
        m.abajo();

        m.derecha();
        m.izquierda();

        m.arriba();

        m.derecha();
        m.derecha();
        m.derecha();

        System.out.println(m.getCooerdenadas());
    }
}
