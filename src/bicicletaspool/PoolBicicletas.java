package bicicletaspool;

/**
 *
 * @author George
 */
public class PoolBicicletas {

    private static PoolBicicletas instancia;
    private Bicicleta[] bicicletas;

    private PoolBicicletas() {

        bicicletas = new Bicicleta[10];
        for (int i = 0; i < 5; i++) {

            bicicletas[i] = new Bicicleta(i);
        }

    }

    public static PoolBicicletas getInstancia() {
        if (instancia == null) {

            instancia = new PoolBicicletas();
        }
        return instancia;
    }

    public Bicicleta getBicicleta(int i) {

        if (bicicletas[i].isDisponibilidad()) {
            System.out.println("Asignando bicicleta " + bicicletas[i].getCodigo());
            System.out.println("|------------------------------------| ");
            System.out.println("|Buena suerte con la bicicleta       |");
            System.out.println("|------------------------------------| ");
            bicicletas[i].setDisponibilidad(false);
            return bicicletas[i];

        } else {
            System.out.println("");
            System.out.println("La bicicleta número " + i + " está prestada en este momento,intente con otro numero");
        }
        return null;
    }

    public void liberarBicicleta(int i) {
        System.out.println("Entregando la bicicleta: " + bicicletas[i].getCodigo());
        bicicletas[i].setDisponibilidad(true);
    }

}
