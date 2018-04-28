package ufjf.br.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaDeIntercambista {
    private static List<Intercambista> intercambistas;

    public static List<Intercambista> getInstance() {
        if (intercambistas == null) {
            intercambistas = new ArrayList<>();
            intercambistas.add(new Intercambista("Suarez","Uruguai","2 semanas"));
            return intercambistas;
        }
        return intercambistas;
    }
}
