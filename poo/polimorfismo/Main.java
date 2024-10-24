package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("RTH56R", "Ferrari", "A3");
        vehiculos[1] = new VehiculoTurismo("RVVK4", "Toyota", "P09", 5);
        vehiculos[2] = new VehiculoDeportivo("24HG", "Audi", "HH", 45);
        vehiculos[3] = new VehiculoFurgoneta("JJ6J", "Volkswagen", "T67", 80);

        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
            System.out.println("");
        }
    }
}
