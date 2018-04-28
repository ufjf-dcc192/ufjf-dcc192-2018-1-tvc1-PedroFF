package ufjf.br.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaDeAnfitriao {
     private static List<Anfitriao> anfitrioes;

    public static List<Anfitriao> getInstance() {
        if (anfitrioes == null) {
            anfitrioes = new ArrayList<>();
            anfitrioes.add(new Anfitriao("Pedro","Discente","2 semanas"));
            return anfitrioes;
        }
        return anfitrioes;
    }
}
