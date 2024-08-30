package Ejecutables;

import Dominio.Turno;
import Util.ComparablePorPrioridad;
import Util.ComparablePorTipo;

import java.util.*;

public class VariosComparadores {
    public static void main(String[] args) {
        List<Turno> turnos = new ArrayList<>(List.of(
                new Turno(1, 2, 3),
                new Turno(2, 1, 2),
                new Turno(3, 3, 1)
        ));

        turnos.sort(new ComparablePorPrioridad());
        System.out.println("Ordenados por prioridad: ");
        for (Turno turno : turnos) {
            System.out.println(turno);
        }

        turnos.sort(new ComparablePorTipo());
        System.out.println("Ordenados por tipo: ");
        for (Turno turno : turnos) {
            System.out.println(turno);
        }

        Collections.sort(turnos);
        System.out.println("Ordenados por secuencia: ");
        for (Turno turno : turnos) {
            System.out.println(turno);
        }

        PriorityQueue<Turno> cola = new PriorityQueue<>(new ComparablePorPrioridad());
        cola.addAll(turnos);
        Turno turno;
        System.out.println("Cola de prioridad: ");
        while ((turno = cola.poll()) != null) {
            System.out.println(turno);
        }
    }
}
