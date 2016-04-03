package com.FilasEPilhas;
import filaDoRestaurante.*;
import mesasDisponiveis.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        filaDoRestaurante filaClientes = new filaDoRestaurante();
        mesasDisponiveis mesas = new mesasDisponiveis();


        filaClientes.inserirNaFila("Marcos");
        filaClientes.inserirNaFila("Ricardo");
        filaClientes.inserirNaFila("Paulo");
        filaClientes.removerDaFila();
        mesas.insereTodasAsMesas();
        System.out.println(mesas.consultar());
        System.out.println(filaClientes.consultar());

        //COMMIT TESTE A
    }
}
