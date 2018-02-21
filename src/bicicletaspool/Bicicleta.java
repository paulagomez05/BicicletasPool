package bicicletaspool;

public class Bicicleta {

    private int codigo;
    private boolean disponibilidad;

    public Bicicleta(int n) {

        codigo = n;
        disponibilidad = true;
    }

    /////////////////////getters and setters /////////////////////////   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
