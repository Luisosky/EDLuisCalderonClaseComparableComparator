package Util;

import Dominio.Turno;

import java.util.Comparator;

public class ComparablePorPrioridad implements Comparator<Turno> {

    @Override
    public int compare(Turno o1, Turno o2) {
        return Integer.compare(o1.getPrioridad(), o2.getPrioridad());
    }
}
