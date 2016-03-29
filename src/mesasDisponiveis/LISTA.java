package mesasDisponiveis;

/**
 *
 * @author Alex
 */
public class LISTA {
    private String nome;
    private LISTA prox;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the prox
     */
    public LISTA getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(LISTA prox) {
        this.prox = prox;
    }
}
