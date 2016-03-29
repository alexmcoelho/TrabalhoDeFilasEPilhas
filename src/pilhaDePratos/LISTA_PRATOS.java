package pilhaDePratos;

/**
 * Created by Alex on 29/03/2016.
 */
public class LISTA_PRATOS {
    private int numPrato;
    private LISTA_PRATOS prox;

    /**
     * @return the numPrato
     */
    public int getNumPrato() {
        return numPrato;
    }

    /**
     * @param numPrato the numPrato to set
     */
    public void setNumPrato(int numPrato) {
        this.numPrato = numPrato;
    }

    /**
     * @return the prox
     */
    public LISTA_PRATOS getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(LISTA_PRATOS prox) {
        this.prox = prox;
    }
}
