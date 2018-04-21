package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private static List<Tarefa> tarefas;

    public static List<Tarefa> getInstance() {
        if (tarefas == null) {
            tarefas = new ArrayList<>();
            tarefas.add(new Tarefa("Estudar PHP","20h de estudo inicial", false));
            tarefas.add(new Tarefa("Estudar Java","20h de estudo avançado", false));
            tarefas.add(new Tarefa("Estudar BD","20h de estudo intermediário", false));
            return tarefas;
        }
        return tarefas;
    }
}
