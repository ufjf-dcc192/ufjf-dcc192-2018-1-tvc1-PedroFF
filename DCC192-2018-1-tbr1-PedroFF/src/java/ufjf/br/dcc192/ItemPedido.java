
package ufjf.br.dcc192;

import java.util.ArrayList;

public class ItemPedido {
    private Item item;
    private int quantidade;
    private static ArrayList<Item> itens;
    
    public static ArrayList<Item> getItens(){
        if(itens == null){
            itens = new ArrayList<>();
            itens.add(new Item(" Refri Lata ", 6.0));
            itens.add(new Item(" RedBull ", 12.0));
            itens.add(new Item(" Smirnoff ICE ", 8.0));
            itens.add(new Item(" Skol Beats ", 9.0));
            itens.add(new Item(" Vodka Orloff ", 50.0));
            itens.add(new Item(" Combo Vodka + Energético ", 70.0));
            itens.add(new Item(" Dose Tequila ", 30.0));
            return itens;
        }
        return itens;
    }

    public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    @Override
    public String toString() {
        return   " Nome: " + item.getNome() + "|| Quantidade: " + quantidade +" ";    
    }
    
    
}
