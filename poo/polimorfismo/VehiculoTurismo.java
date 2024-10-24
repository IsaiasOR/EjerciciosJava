package polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    private int numPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numPuertas) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Vehiculo Turismo" +
                "\nNúmero de puertas: " + numPuertas +
                "\nMatricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }
}
