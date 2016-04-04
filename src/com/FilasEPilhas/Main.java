package com.FilasEPilhas;
import filaDoRestaurante.*;
import mesasDisponiveis.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        filaDoRestaurante filaClientes = new filaDoRestaurante();
        mesasDisponiveis mesas = new mesasDisponiveis();


        filaClientes.inserirNaFilaRestaurante("Marcos");
        filaClientes.inserirNaFilaRestaurante("Ricardo");
        filaClientes.inserirNaFilaRestaurante("Paulo");
        filaClientes.removerDaFila();
        mesas.insereTodasAsMesas();
        System.out.println(mesas.consultar());
        System.out.println(filaClientes.consultar());
        System.out.println(filaClientes.numDePessoasQueEstaoNaFilaRest());
        System.out.println(mesas.ocupaMesa("MESA 1"));
        System.out.println(mesas.consultar());
        System.out.println(mesas.ocupaMesa("MESA 7"));
        System.out.println(mesas.consultar());
    }
}
