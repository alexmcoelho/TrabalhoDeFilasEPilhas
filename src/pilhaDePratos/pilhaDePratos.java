package pilhaDePratos;

/**
 * Created by Alex on 29/03/2016.
 */
public class pilhaDePratos {
    ListaDePratos topo=  null;
    //o objeto fim contera o ultimo elemento da lista
    ListaDePratos fim = null;
    //O objeto aux é um objeto auxiliar
    ListaDePratos aux = null;

    ListaDePratos contPratos = new ListaDePratos();

    public String empilhar(int numero) {
        StringBuilder builder = new StringBuilder();
        ListaDePratos novo = new ListaDePratos();
        novo.setNumPrato(numero);
        if (topo == null) {
            topo = novo;
            fim = novo;
            novo.setProx(null);
        } else {
            novo.setProx(topo);
            topo = novo;
        }
        contPratos.setContador(contPratos.getContador()+1);
        builder.append("Número inserido na pilha.");

        return builder.toString();
    }

    public String desinpillhar() {
        StringBuilder builder = new StringBuilder();
        aux = topo;
        //o numeor a ser removido é o primeiro da lista
        topo = (ListaDePratos) aux.getProx();
        aux = topo;
        contPratos.setContador(contPratos.getContador()-1);
        builder.append("Elemento excluído com sucesso!");
        return builder.toString();
    }

    //verifica se a pilha de pratos está vazia
    public boolean verificaSePilhaDePratos() {
        boolean temPratos = true;
        aux = topo;
        if(aux == null){
            temPratos = false;
        }
        return temPratos;
    }
}
