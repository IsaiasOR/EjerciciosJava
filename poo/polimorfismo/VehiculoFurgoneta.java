package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Vehiculo Furgoneta" +
                "\nCarga: " + carga +
                "\nMatricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }
}
