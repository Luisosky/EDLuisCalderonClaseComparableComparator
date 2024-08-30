package Dominio;

public class Turno implements Comparable<Turno> {
    private int secuencia;
    private int prioridad;
    private int tipo;

    public Turno(int secuencia, int prioridad, int tipo) {
        this.secuencia = secuencia;
        this.prioridad = prioridad;
        this.tipo = tipo;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "secuencia=" + secuencia +
                ", prioridad=" + prioridad +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public int compareTo(Turno o) {
        return this.secuencia - o.secuencia;
    }
}
