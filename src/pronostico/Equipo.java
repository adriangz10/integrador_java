package pronostico;

public class Equipo {
    private String nombre;
    private int cantidadGoles;

    public Equipo(String nombre, int cantidadGoles) {
        this.nombre = nombre;
        this.cantidadGoles = cantidadGoles;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }
}


