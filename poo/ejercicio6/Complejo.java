package ejercicio6;

/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero
 */

public class Complejo {
    private double real;
    private double imaginario;

    public Complejo() {
        this.real = 0.0;
        this.imaginario = 0.0;
    }

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public void setComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public Complejo suma(Complejo operando) {
        Complejo resultado = new Complejo();

        resultado.setReal(this.real + operando.getReal());
        resultado.setImaginario(this.imaginario + operando.getImaginario());

        return resultado;
    }

    public Complejo resta(Complejo operando) {
        Complejo resultado = new Complejo();

        resultado.setReal(this.real - operando.getReal());
        resultado.setImaginario(this.imaginario - operando.getImaginario());

        return resultado;
    }

    public Complejo multiplicacion(Complejo operando) {
        Complejo resultado = new Complejo();

        resultado.setComplejo(
                (this.real * operando.getReal()) - (this.imaginario * operando.getImaginario()),
                (this.real * operando.getImaginario()) + (this.imaginario * operando.getReal())
        );

        return resultado;
    }

    public Complejo division(Complejo operando) {
        Complejo resultado = new Complejo();

        resultado.setComplejo(
                ((this.real * operando.getReal()) + (this.imaginario * operando.getImaginario()))
                        /
                        ((operando.getReal() * operando.getReal()) + (operando.getImaginario() * operando.getImaginario())),
                ((this.real * operando.getImaginario()) - (this.imaginario * operando.getReal()))
                        /
                        ((operando.getReal() * operando.getReal()) + (operando.getImaginario() * operando.getImaginario()))
        );

        return resultado;
    }
}
