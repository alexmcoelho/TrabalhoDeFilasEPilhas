package filaDeBuffet;

/**
 * Created by Alex on 29/03/2016.
 */
public class filaDoBuffet {
    filaDoRestaurante.LISTA inicio = null;
    //o objeto fim contera o ultimo elemento da lista
    filaDoRestaurante.LISTA fim = null;
    //O objeto aux é um objeto auxiliar
    filaDoRestaurante.LISTA aux = null;
    //objeto anterior um objeto auxliar
    filaDoRestaurante.LISTA anterior = null;

    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String inserirNaFila(String nomeCliente) {
        StringBuilder builder = new StringBuilder();

        filaDoRestaurante.LISTA novo = new filaDoRestaurante.LISTA();
        novo.setNome(nomeCliente);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            novo.setProx(null);
        } else {
            //no fim da lista
            fim.setProx(novo) ;
            fim = novo;
            fim.setProx(null);
            builder.append("Inserido na fila.");
        }
        setContador(getContador()+1);
        return builder.toString();
    }

    public String removerDaFila() {
        StringBuilder builder = new StringBuilder();

        aux = inicio;
        //o numeor a ser removido é o primeiro da lista
        inicio = aux.getProx();
        aux = inicio;

        setContador(getContador() - 1);
        builder.append("Elemento excluído com sucesso!");
        return builder.toString();
    }

    public String consultar() {
        StringBuilder builder = new StringBuilder();

        System.out.println("Mostrando toda lista");
        aux = inicio;
        while (aux != null) {
            builder.append(aux.getNome() + " | ");
            aux = aux.getProx();
        }
        builder.append("\nQuantidade de pessoas na fila do Buffet= "+getContador());
        return builder.toString();
    }
}
