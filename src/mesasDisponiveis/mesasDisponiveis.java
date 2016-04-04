package mesasDisponiveis;

/**
 * Created by Alex on 29/03/2016.
 */
public class mesasDisponiveis {

    ListaMesasDisp inicio = null;
    //o objeto fim contera o ultimo elemento da lista
    ListaMesasDisp fim = null;
    //O objeto aux é um objeto auxiliar
    ListaMesasDisp aux = null;

    ListaMesasDisp cont = new ListaMesasDisp();

    //metodo que insere todas as mesas
    public void insereTodasAsMesas(){
        cont.setContador(30);
        for(int i = 0;i < cont.getContador(); i++) {
            ListaMesasDisp novo = new ListaMesasDisp();
            novo.setStatus("LIVRE");
            //insere MESA 30, MESA 29, MESA 28, ... ,
            novo.setNomeDaMesa("MESA " + (cont.getContador() - i));
            if(i == 0){
                // a lista estava vazia e o elemento sera o primeiro e o ultimo
                inicio = novo;
                fim = novo;
                novo.setProx(null);
            } else {
                // a lista ja� contem elementos e o novo elemento sera inserido no fim da lista
                fim.setProx(novo);
                fim = novo;
                fim.setProx(null);
            }
        }
    }

    public String ocupaMesa(String mesa){
        StringBuilder builder = new StringBuilder();
        aux = inicio;
        String soGuardaAMesa = "";
        /*do{
            if(aux.getNomeDaMesa().equals(mesa)) {
                aux.setStatus("OCUPADA");
                soGuardaAMesa = aux.getNomeDaMesa();
                aux = (ListaMesasDisp) aux.getProx();
            }else{
                aux = (ListaMesasDisp) aux.getProx();
            }
        }while(aux != inicio);*/
        while (aux != null) {
            if(aux.getNomeDaMesa().equals(mesa)) {
                aux.setStatus("OCUPADA");
                soGuardaAMesa = aux.getNomeDaMesa();
                aux = (ListaMesasDisp) aux.getProx();
            }else{
                aux = (ListaMesasDisp) aux.getProx();
            }
        }
            builder.append("A Mesa que foi ocupada é a "+soGuardaAMesa+".");
            //cont++
        return builder.toString();
    }

    public void decupaMesa(){
        ListaMesasDisp novo = new ListaMesasDisp();
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
            builder.append(aux.getStatus() + " | " + aux.getNomeDaMesa() + "\n");
            aux = (ListaMesasDisp) aux.getProx();
        }
        //builder.append("\nQuantidade de pessoas na fila do Buffet= "+getContador());
        return builder.toString();
    }
}
