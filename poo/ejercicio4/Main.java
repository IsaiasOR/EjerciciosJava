package ejercicio4;

public class Main {
    public static Atleta compararTiempos(Atleta atletas[]) {
        Atleta atletaMTiempo = atletas[0];

        for (int i=1; i<atletas.length; i++) {
            if (atletaMTiempo.getTiempoCarrera() > atletas[i].getTiempoCarrera()) {
                atletaMTiempo = atletas[i];
            }
        }

        return atletaMTiempo;
    }

    public static void main(String[] args) {
        Atleta atletas[] = new Atleta[5];
        Atleta atletaCampeon;

        Atleta a1 = new Atleta(12, "Joaquín", 30.1f);
        Atleta a2 = new Atleta(2, "Kevin", 34.9f);
        Atleta a3 = new Atleta(23, "Luisa", 28.4f);
        Atleta a4 = new Atleta(27, "Juan", 32f);
        Atleta a5 = new Atleta(8, "Sofía", 29.6f);

        atletas[0] = a1;
        atletas[1] = a2;
        atletas[2] = a3;
        atletas[3] = a4;
        atletas[4] = a5;

        atletaCampeon = compararTiempos(atletas);

        System.out.println("El atleta con menor tiempo en la carrera es: ");
        System.out.println(atletaCampeon.toString());
    }
}
