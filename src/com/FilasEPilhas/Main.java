package com.FilasEPilhas;
import filaDoRestaurante.*;
import mesasDisponiveis.*;
import pilhaDePratos.*;
import java.util.Scanner;

public class Main {

    private static Scanner ler;

    public static void main(String[] args) {
        ler = new Scanner(System.in);

        filaDoRestaurante filaClientes = new filaDoRestaurante();
        mesasDisponiveis mesas = new mesasDisponiveis();
        pilhaDePratos pratos = new  pilhaDePratos();

        pratos.empilharInicio();
        pratos.reposicaoDePratos(15);
        System.out.println(pratos.consultar());
        /*filaClientes.inserirNaFilaRestaurante("Marcos");
        filaClientes.inserirNaFilaRestaurante("Ricardo");
        filaClientes.inserirNaFilaRestaurante("Paulo");
        filaClientes.removerDaFila();
        mesas.insereTodasAsMesas();
        System.out.println(mesas.consultar());
        System.out.println(filaClientes.consultar());
        System.out.println(mesas.ocupaMesa("MESA 1"));
        System.out.println(mesas.ocupaMesa("MESA 7"));
        System.out.println(mesas.consultar());
        System.out.println(pratos.verificaSePilhaDePratos());*/

        int opcao = 0;
        do {
            System.out.printf("\n**** Menu Principal *****\n");
            System.out.printf("[ 1 ] Inserir na fila do restaurante \n");
            System.out.printf("[ 2 ] Inserir na fila do Buffet \n");
            System.out.printf("[ 3 ] Escolha de mesa \n");
            System.out.printf("[ 4 ] Inserir na fila do Caixa \n");
            System.out.printf("[ 5 ] Efetuar pagamento \n");
            System.out.printf("[ 6 ] Reposição de pratos \n");
            System.out.printf("[ 0 ] Sair\n");
            System.out.printf("\nOpção Desejada: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:

                    break;
            }
        } while (opcao != 0);
    }
}
