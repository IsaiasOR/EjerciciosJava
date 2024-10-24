package abstracto;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Persona persona = new Persona();
        persona.alimentacion();
        System.out.println("");

        Perro perro = new Perro();
        perro.alimentacion();
        System.out.println("");

        Planta planta = new Planta();
        planta.alimentacion();
        System.out.println("");

        Vaca vaca = new Vaca();
        vaca.alimentacion();
    }
}
