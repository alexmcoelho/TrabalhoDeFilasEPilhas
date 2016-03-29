package mesasDisponiveis;

/**
 *
 * @author Alex
 */
public class LISTA {
    private String status;
    private LISTA prox;

    /**
     * @return the nome
     */
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
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
