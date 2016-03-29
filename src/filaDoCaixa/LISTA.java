package filaDoCaixa;

/**
 * Created by Alex on 29/03/2016.
 */
public class LISTA {
    private String nome;
    private LISTA prox;

    public LISTA getProx() {
        return prox;
    }

    public void setProx(LISTA prox) {
        this.prox = prox;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

