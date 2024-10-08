package ejercicio3;

/*
Ejercicio 3:
Construir un programa que dada una serie de vehículos caracterizados por
su marca, modelo y precio, imprima las propiedades del vehículo más barato.
Para ello, se deberán leer por teclado las características de cada vehículo y
crear una clase que represente a cada uno de ellos.
 */

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String mostrarDatos() {
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nPrecio: $" + this.precio + "\n";
    }
}
