package ufjf.br.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaDeMesas {

    private static List<Mesa> mesas;

    public static List<Mesa> getInstance() {
        if (mesas == null) {
            mesas = new ArrayList<>();
            mesas.add(new Mesa());
            mesas.get(0).setPedidos(new ArrayList<>());
            return mesas;
        }
        return mesas;
    }
}
