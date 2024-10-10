package ejercicio5;

/*
Ejercicio 5:
Diseñar un programa para trabajar con triángulos isósceles.
Para ello defina los atributos necesarios que se requieren,
proporcione métodos de consulta, un método constructor e
implemente métodos para calcular el perímetro y el área de un triángulo,
además implementar un método que a partir de un arreglo de triángulos
devuelva el área del triángulo de mayor superficie.
 */

public class Triangulo {
    private double lado;
    private double base;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public double getBase() {
        return this.base;
    }

    public double getPerimetro() {
        double perimetro = 2 * this.lado + this.base;
        return  perimetro;
    }

    public double getArea() {
        double area = (this.base * Math.sqrt((this.lado * this.lado) - ((this.base * this.base) / 4))) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Base: " + this.base +
                "\nLados: " + this.lado +
                "\nPerimetro: " + getPerimetro() +
                "\nArea" + getArea();
    }
}
