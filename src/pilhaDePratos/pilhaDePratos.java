package pilhaDePratos;

/**
 * Created by Alex on 29/03/2016.
 */
public class pilhaDePratos {
    LISTA_PRATOS topo=  null;
    //o objeto fim contera o ultimo elemento da lista
    LISTA_PRATOS fim = null;
    //O objeto aux é um objeto auxiliar
    LISTA_PRATOS aux = null;
    //objeto anterior um objeto auxliar
    LISTA_PRATOS anterior = null;

    public String empilhar(int numero) {
        StringBuilder builder = new StringBuilder();

        LISTA_PRATOS novo = new LISTA_PRATOS();
        novo.setNumPrato(numero);
        if (topo == null) {
            topo = novo;
            fim = novo;
            novo.setProx(null);
        } else {
            novo.setProx(topo);
            topo = novo;
        }
        builder.append("Número inserido na pilha.");

        return builder.toString();
    }

    public String desinpillhar() {
        StringBuilder builder = new StringBuilder();

        aux = topo;
        //o numeor a ser removido é o primeiro da lista
        topo = aux.getProx();
        aux = topo;

        builder.append("Elemento excluído com sucesso!");
        return builder.toString();
    }

    public String consultar() {
        StringBuilder builder = new StringBuilder();

        System.out.println("Mostrando toda lista");
        aux = topo;
        while (aux != null) {
            builder.append(aux.getNumPrato() + " | ");
            aux = aux.getProx();
        }

        return builder.toString();
    }
}
