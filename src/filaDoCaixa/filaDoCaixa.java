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
        }
        builder.append("Inserido na fila do caixa com sucesso!");
        cont.setContador(cont.getContador()+1);
        return builder.toString();
    }

    public String removerDaFilaDoCaixa(float valor) {
        StringBuilder builder = new StringBuilder();

        aux = inicio;
        //item a sera removido é o primeiro da lista
        inicio = (ListaCaixa) aux.getProx();
        aux = inicio;

        cont.setValor(cont.getValor() + valor);
        cont.setContador(cont.getContador() - 1);
        cont.setContadorPesAtendidas(cont.getContadorPesAtendidas() + 1);

        builder.append("Pagamento efetuado com sucesso.");
        return builder.toString();
    }

    public int qtdPessoasFilaDoCaixa(){
        return cont.getContador();
    }

    public int qtdPessoasAtendidas(){
        return cont.getContadorPesAtendidas();
    }

    public float valorMovimentado(){
        return cont.getValor();
    }

    //verifica se a fila está vazia ou nao
    public boolean verificaFilaCaixa(){
        boolean temGenteNaFila = true;
        if(inicio == null){
            temGenteNaFila = false;
        }
        return temGenteNaFila;
    }

    //pega primeiro elemento da fila
    public String pegaPrimeiroElemento(){
        return inicio.getNome();
    }


}

