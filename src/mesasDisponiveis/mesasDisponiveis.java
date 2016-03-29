package mesasDisponiveis;

/**
 * Created by Alex on 29/03/2016.
 */
public class mesasDisponiveis {

    LISTA inicio = null;
    //o objeto fim contera o ultimo elemento da lista
    LISTA fim = null;
    //O objeto aux é um objeto auxiliar
    LISTA aux = null;
    //objeto anterior um objeto auxliar
    LISTA anterior = null;

    private int contador =30;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }


    //metodo que insere todas as mesas
    public void insereTodasAsMesas(){
        for(int i = 0;i < getContador(); i++) {
            LISTA novo = new LISTA();
            novo.setStatus("LIVRE");
            if(i == 0){
                // a lista estava vazia e o elemento ser� o primeiro e o
                // �litmo
                inicio = novo;
                fim = novo;
                novo.setProx(null);
            } else {
                // a lista j� cont�m elementose o novo elemento ser�
                // inserido
                // no fim da lista
                fim.setProx(novo);
                fim = novo;
                fim.setProx(null);
            }
        }
    }

    public void ocupaMesa(){
        //StringBuilder builder = new StringBuilder();
        aux = inicio;
        //o numeor a ser removido é o primeiro da lista
        inicio = aux.getProx();
        aux = inicio;
        setContador(getContador()-1);
        //builder.append("Elemento excluído com sucesso!");
        //return builder.toString();
    }

    public void decupaMesa(){
        LISTA novo = new LISTA();
        novo.setStatus("LIVRE");
        fim.setProx(novo);
        fim = novo;
        fim.setProx(null);
    }

    public String consultar() {
        StringBuilder builder = new StringBuilder();

        System.out.println("Mostrando toda lista");
        aux = inicio;
        while (aux != null) {
            builder.append(aux.getStatus() + " | ");
            aux = aux.getProx();
        }
        //builder.append("\nQuantidade de pessoas na fila do Buffet= "+getContador());
        return builder.toString();
    }
}
