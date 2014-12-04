package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroPrimoBase = 11;
        if (comprobarPrimo(numeroPrimoBase)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int i = 2; i < 1000; i++) { //He cambiado x por i porque es más 'típico' ver un bucle for con i.
            if (comprobarPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean comprobarPrimo(int numeroIntroducido) {
        int numeroPar = 2;
        boolean esPrimo = true;
        while ((esPrimo) && (numeroPar != numeroIntroducido)) {
            if (numeroIntroducido % numeroPar == 0) {
                esPrimo = false;
            }
            numeroPar++;
        }
        return esPrimo;
    }

}
