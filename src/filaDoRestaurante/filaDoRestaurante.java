package filaDoRestaurante;

/**
 * Created by Alex on 29/03/2016.
 */
public class filaDoRestaurante {
    ListaRestaurante inicio = null;
    //o objeto fim contera o ultimo elemento da lista
    ListaRestaurante fim = null;
    //O objeto aux é um objeto auxiliar
    ListaRestaurante aux = null;

    ListaRestaurante cont = new ListaRestaurante();

    public String inserirNaFilaRestaurante(String nomeCliente) {
        StringBuilder builder = new StringBuilder();

        ListaRestaurante novo = new ListaRestaurante();
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
        builder.append("Inserido na fila com sucesso.");
        cont.setContador(cont.getContador()+1);
        return builder.toString();
    }

    public String removerDaFila() {
        StringBuilder builder = new StringBuilder();

        aux = inicio;
        //item a ser removido é o primeiro da lista
        inicio = (ListaRestaurante) aux.getProx();
        aux = inicio;

        cont.setContador(cont.getContador() - 1);
        builder.append("Elemento excluído com sucesso!");
        return builder.toString();
    }

    public int numDePessoasQueEstaoNaFilaRest(){
        return cont.getContador();
    }

    //pega primeiro elemento da fila
    public String pegaPrimeiroElemento(){
        return inicio.getNome();
    }

    //verifica se a fila está vazia ou nao
    public boolean verificaFila(){
        boolean temGenteNaFila = true;
        if(inicio == null){
            temGenteNaFila = false;
        }
        return temGenteNaFila;
    }


}

