public class DrivingLicense {

    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) que contenga los puntos del carnet de conducir que empiece con 0 puntos.
        int PuntosCarnetDeConducir = 0;
        System.out.println("Has sacado tu carnet de conducir, felicidades tienes 12 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir += 12;
        System.out.println("Te has negado a realizar pruebas de alcohol o drogas, pierdes 6 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir -= 6;
        System.out.println("Has conducido con cascos o auriculares, pierdes 3 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir -= 3;
        System.out.println("Tu coche detecta radares, pierdes 3 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir -= 3;
        System.out.println("Te han retirado el carnet y ahora lo has recuperado, ganas 8 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir += 8;
        System.out.println("Has conducido sin haber cometido ninguna infracción en el transcurso de 2 años, ganas 4 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir += 4;
        System.out.println("Han pasado 3 años y sigues sin cometer infracciones, ganas 2 puntos");
        // Actualiza los puntos aquí
        PuntosCarnetDeConducir += 2;
        System.out.println( "¿Cuantos puntos tienes?");
        System.out.println("Enhorabuena tienes: " + PuntosCarnetDeConducir + " puntos del carnet");
        // Imprimir el total de puntos que tienes actualmente
    }

}