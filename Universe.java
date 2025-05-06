public class Universe {
    public static void main(String[] args) {
        // int WorldPopulationToday = 8220200749;
        // System.out.println(WorldPopulationToday);

        //long WorldPopulationToday = 8220200749;
        // System.out.println(WorldPopulation);

        // long WorldPopulationToday = 8220200749L;
        // System.out.println(WorldPopulationToday);

        //long WorldPopulation = 8_220_200_749L;
        // System.out.println("La población mundial actual es de 8_220_200_749L habitantes.");

        //La vía láctea parece tener unos cuatrocientos mil millones de estrellas, crea una variable con esa cantidad.

        long milkyWay = 400_000_000_000L;
        long Andromeda = 1_000_000_000_000L;
        //Corre este código y mira cuál es el problema
        System.out.println("Hay " +  (milkyWay + Andromeda) + " de estrellas en Andrómeda y en la Vía Láctea juntas.");

        //El problema es que está añadiendo el valor de milkyWay al String anterior, lo que convierte ese valor en String y cuando llega a andromeda también lo convierte a String y no puede hacer la operación matemática. Para dar prioridades de operaciones, usamos los paréntesis.

        //Intenta resolver este problema dentro del System.out.println para que nos devuelva la suma de milkyWay + andromeda


    }
}

