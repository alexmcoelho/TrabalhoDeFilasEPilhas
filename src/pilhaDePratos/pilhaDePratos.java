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


    public void empilharInicio() {
        contPratos.setContador(30);
        ListaDePratos novo = new ListaDePratos();
        int contadorDePra = 1;
        for(int i = 0;i < contPratos.getContador(); i++) {
            novo.setNumPrato(contadorDePra);
            if(i == 0){
                // a lista estava vazia e o elemento sera o primeiro e o ultimo
                topo = novo;
                fim = novo;
                novo.setProx(null);
            } else {
                // a lista ja� contem elementos e o novo elemento sera inserido no fim da lista
                novo.setProx(topo);
                topo = novo;
            }
        }
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
