package pronostico;

public class Ronda {
    private String nro;
    private Partido partido[];
    public Ronda(String nro, Partido[] partido) {
        this.nro = nro;
        this.partido = partido;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public Partido[] getPartido() {
        return partido;
    }

    public void setPartido(Partido[] partido) {
        this.partido = partido;
    }
    public int puntos() {
        return 0;
    }
}
