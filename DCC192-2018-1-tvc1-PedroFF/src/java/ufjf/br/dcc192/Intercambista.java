package ufjf.br.dcc192;


public class Intercambista {
    String nome;
    String paisOrigem;
    String tempoEstadia;

    public Intercambista(String nome, String paisOrigem, String tempoEstadia) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.tempoEstadia = tempoEstadia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getTempoEstadia() {
        return tempoEstadia;
    }

    public void setTempoEstadia(String tempoEstadia) {
        this.tempoEstadia = tempoEstadia;
    }
    
    
}
