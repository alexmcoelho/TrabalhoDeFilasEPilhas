package mesasDisponiveis;

import com.FilasEPilhas.Lista;

/**
 *
 * @author Alex
 */
public class ListaMesasDisp extends Lista {
    private String status;
    private String nomeDaMesa;
    /**
     * @return the nome
     */
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeDaMesa() {
        return nomeDaMesa;
    }

    public void setNomeDaMesa(String nomeDaMesa) {
        this.nomeDaMesa = nomeDaMesa;
    }
}
