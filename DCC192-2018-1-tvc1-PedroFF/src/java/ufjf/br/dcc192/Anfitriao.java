
package ufjf.br.dcc192;

public class Anfitriao {
    String nome;
    String categoria;
    String possibilidadeDeEstadia;
    String email;

    public Anfitriao(String nome, String categoria, String possibilidadeDeEstadia, String email) {
        this.nome = nome;
        this.categoria = categoria;
        this.possibilidadeDeEstadia = possibilidadeDeEstadia;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPossibilidadeDeEstadia() {
        return possibilidadeDeEstadia;
    }

    public void setPossibilidadeDeEstadia(String possibilidadeDeEstadia) {
        this.possibilidadeDeEstadia = possibilidadeDeEstadia;
    }
    
    
}
