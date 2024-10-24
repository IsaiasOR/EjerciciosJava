package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    private int cilidrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilidrada) {
        super(matricula, marca, modelo);
        this.cilidrada = cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    @Override
    public String toString() {
        return "Vehiculo Deportivo"  +
                "\nCilindrada: " + cilidrada +
                "\nMatricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }
}
