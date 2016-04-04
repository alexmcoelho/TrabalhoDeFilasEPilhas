package filaDoCaixa;

/**
 * Created by Alex on 29/03/2016.
 */
public class filaDoCaixa {
    ListaCaixa inicio = null;
    //o objeto fim contera o ultimo elemento da lista
    ListaCaixa fim = null;
    //O objeto aux é um objeto auxiliar
    ListaCaixa aux = null;

    ListaCaixa cont = new ListaCaixa();

    public String inserirNaFilaDoCaixa(String nomeCliente) {
        StringBuilder builder = new StringBuilder();

        ListaCaixa novo = new ListaCaixa();
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
        cont.setContador(cont.getContador()+1);
        return builder.toString();
    }

    public String removerDaFilaDoCaixa() {
        StringBuilder builder = new StringBuilder();

        aux = inicio;
        //item a ser removido é o primeiro da lista
        inicio = (ListaCaixa) aux.getProx();
        aux = inicio;

        cont.setContador(cont.getContador() - 1);
        builder.append("Elemento excluído com sucesso!");
        return builder.toString();
    }

    public String consultar() {
        StringBuilder builder = new StringBuilder();

        System.out.println("Mostrando toda lista");
        aux =  inicio;
        while (aux != null) {
            builder.append(aux.getNome() + " | ");
            aux = (ListaCaixa) aux.getProx();
        }
        return builder.toString();
    }

    public String numDePessoasQueEstaoNaFilaCaixa(){
        StringBuilder builder = new StringBuilder();
        builder.append("\nQuantidade de pessoas que estão na fila do Caixa = "+ cont.getContador());
        return builder.toString();
    }


}

