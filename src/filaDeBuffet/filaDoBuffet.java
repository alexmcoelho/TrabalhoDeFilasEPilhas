package filaDeBuffet;

/**
 * Created by Alex on 29/03/2016.
 */
public class filaDoBuffet {
    ListaBuffet inicio = null;
    //o objeto fim contera o ultimo elemento da lista
    ListaBuffet fim = null;
    //O objeto aux é um objeto auxiliar
    ListaBuffet aux = null;

    public String inserirNaFila(String nomeCliente) {
        StringBuilder builder = new StringBuilder();

        ListaBuffet novo = new ListaBuffet();
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
        builder.append("Inserido na fila do Buffet com sucesso.");
        return builder.toString();
    }

    public String removerDaFila() {
        StringBuilder builder = new StringBuilder();

        aux = inicio;
        //o numeor a ser removido é o primeiro da lista
        inicio = (ListaBuffet) aux.getProx();
        aux = inicio;

        builder.append("Elemento excluído com sucesso!");
        return builder.toString();
    }

    //pega primeiro elemento da fila
    public String pegaPrimeiroElemento(){
        return inicio.getNome();
    }

    //verifica se a fila está vazia ou nao
    public boolean verificaFilaBuffet(){
        boolean temGenteNaFila = true;
        if(inicio == null){
            temGenteNaFila = false;
        }
        return temGenteNaFila;
    }
}
