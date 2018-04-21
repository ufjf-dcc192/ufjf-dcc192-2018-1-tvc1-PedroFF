package ufjf.br.dcc192;

import java.util.ArrayList;
import java.util.List;

public class ListaDeMesas {

    private static List<Mesa> mesas;

    public static List<Mesa> getInstance() {
        if (mesas == null) {
            mesas = new ArrayList<>();
            mesas.add(new Mesa());
            return mesas;
        }
        return mesas;
    }
}
