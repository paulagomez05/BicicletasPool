package bicicletaspool;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class PrestamoBiciPool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int masPrestamo;
        int opcion;
        do {

            System.out.println("SELECCIONE: ");
            System.out.println("1)PRESTAR OTRA BICICLETA");
            System.out.println("2)DEVOLVER BICICLETA ");
            System.out.println("3)SALIR");

            masPrestamo = sc.nextInt();
            PoolBicicletas asignacion = PoolBicicletas.getInstancia();
            switch (masPrestamo) {
                case 1:
                    System.out.println("Ingrese el numero de bicicleta que desea prestar (1-10)");
                    opcion = sc.nextInt();
                    asignacion.getBicicleta(opcion);
                    break;
                case 2:
                    System.out.println("Ingrese el numero de bicicleta que desea devolver");
                    opcion = sc.nextInt();
                    asignacion.liberarBicicleta(opcion);

                    break;
                case 3:
                    break;
            }

        } while (masPrestamo != 3);

    }

}
