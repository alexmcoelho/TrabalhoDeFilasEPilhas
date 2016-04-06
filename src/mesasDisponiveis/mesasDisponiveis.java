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

    ListaMesasDisp contMesaLivre = new ListaMesasDisp();

    //metodo que insere todas as mesas
    public void insereTodasAsMesas(){
        contMesaLivre.setContador(30);
        for(int i = 0;i < contMesaLivre.getContador(); i++) {
            ListaMesasDisp novo = new ListaMesasDisp();
            novo.setStatus("LIVRE");
            //insere MESA 30, MESA 29, MESA 28, ... ,
            novo.setNomeDaMesa("MESA " + (contMesaLivre.getContador() - i));
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
        boolean mesaEstaLivre = false;
        while (aux != null && mesaEstaLivre == false) {
            if(aux.getNomeDaMesa().equals(mesa) && aux.getStatus().equals("LIVRE")) {
                aux.setStatus("OCUPADA");
                soGuardaAMesa = aux.getNomeDaMesa();
                aux = (ListaMesasDisp) aux.getProx();
                mesaEstaLivre = true;
            }else{
                aux = (ListaMesasDisp) aux.getProx();
            }
        }

        if(mesaEstaLivre == true){
            //retira 1 do contador
            contMesaLivre.setContador(contMesaLivre.getContador() - 1);
            builder.append("OK");
        }else{
            builder.append("A Mesa informada está incorreta!");
        }
        return builder.toString();
    }

    public String decupaMesa(String mesa){
        StringBuilder builder = new StringBuilder();
        aux = inicio;
        boolean desocupouMesa = false;
        while (aux != null && desocupouMesa == false) {
            //verifica status
            if(aux.getNomeDaMesa().equals(mesa)) {
                aux.setStatus("LIVRE");
                aux = (ListaMesasDisp) aux.getProx();
                desocupouMesa = false;
            }else{
                aux = (ListaMesasDisp) aux.getProx();
            }
        }
        if(desocupouMesa == true){
            //add 1 no contador
            contMesaLivre.setContador(contMesaLivre.getContador() + 1);
            builder.append("OK");
        }else{
            builder.append("A Mesa informada está incorreta!");
        }
        return builder.toString();
    }

    public String consultarMesasDisp() {
        StringBuilder builder = new StringBuilder();

        aux = inicio;
        while (aux != null) {
            if(aux.getStatus().equals("LIVRE")){
                builder.append(aux.getNomeDaMesa() + " | " + aux.getStatus() + "\n");
            }
            aux = (ListaMesasDisp) aux.getProx();
        }
        //builder.append("\nQuantidade de mesas livres = " + contMesaLivre.getContador());
        return builder.toString();
    }

    public int qtdMesasDisponiveis(){
        return contMesaLivre.getContador();
    }


}
