
package ufjf.br.dcc192;

import java.util.ArrayList;
import java.util.List;


public class Mesa {

    private int numMesa = 0; //essa variável vai controlar o fluxo de mesas.
    private List<Pedido> pedidos; // essa lista vai controlar os pedidos por mesa.
    private boolean status;
    public Mesa() {
        this.numMesa++;
        this.pedidos = new ArrayList<>();
        this.status = true;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    @Override
    public String toString() {
        return "Mesa "+ this.numMesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
}
