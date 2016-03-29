package com.FilasEPilhas;
import filaDoRestaurante.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        filaDoRestaurante filaClientes = new filaDoRestaurante();

        filaClientes.inserirNaFila("Marcos");
        filaClientes.inserirNaFila("Ricardo");
        filaClientes.inserirNaFila("Paulo");
        filaClientes.removerDaFila();

        System.out.println(filaClientes.consultar());
    }
}
