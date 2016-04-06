package com.FilasEPilhas;
import com.sun.org.apache.xpath.internal.SourceTree;
import filaDeBuffet.*;
import filaDoRestaurante.*;
import mesasDisponiveis.*;
import pilhaDePratos.*;
import java.util.Scanner;
import filaDoCaixa.*;

public class Main {

    private static Scanner ler;

    public static void main(String[] args) {
        ler = new Scanner(System.in);

        filaDoRestaurante filaClientesR = new filaDoRestaurante();
        mesasDisponiveis mesas = new mesasDisponiveis();
        pilhaDePratos pratos = new  pilhaDePratos();
        filaDoBuffet buffet = new filaDoBuffet();
        filaDoCaixa caixa = new filaDoCaixa();

        /*pratos.empilharInicio();
        pratos.reposicaoDePratos(15);
        System.out.println(pratos.consultar());
        filaClientesR.inserirNaFilaRestaurante("Alex");
        filaClientesR.inserirNaFilaRestaurante("Lucas");
        System.out.println(filaClientesR.pegaPrimeiroElemento());*/

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

        int opcao= 1;
        int num;
        String nome;
        String guardaResultadoMetodo;
        char inf;

        //inicia com 30 pratos e 30 mesas
        mesas.insereTodasAsMesas();
        pratos.empilharInicio();

        do {
            //ler.nextLine();
            System.out.printf("\n**** Menu Principal *****\n");
            System.out.printf("[ 1 ] Inserir na fila do Restaurante \n");
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
                    ler.nextLine();
                    System.out.println("Fila do Restaurante.");
                    System.out.println("Informe o nome da pessoa que será inserido: ");
                    nome = ler.nextLine();
                    System.out.println(filaClientesR.inserirNaFilaRestaurante(nome));
                    break;

                case 2:
                    /*quando essa opção for chamada, vai pegar o primeiro elemento da fila do restaurante
                    e irá colocar esse mesmo elemento na fila do Buffet, isso se ter pratos na pilha, e lógico,
                    a fila do Restaurante tem que ter ao menos uma pessoa. Também removerá o elemento da fila
                    do Restaurante
                     */
                    if(pratos.verificaPilhaDePratos() == false){
                        System.out.println("Não possui pratos na pilha!");
                    }else if(filaClientesR.verificaFila() == false){
                        System.out.println("Está furando fila");
                    }else{
                        System.out.println(buffet.inserirNaFila(filaClientesR.pegaPrimeiroElemento()));
                        filaClientesR.removerDaFila();
                    }
                    break;

                case 3:
                    ler.nextLine();
                    if(buffet.verificaFilaBuffet() == false){
                        System.out.println("Primeiro o cliente tem que fazer seu prato!");
                    }else{
                        System.out.println("Mesas Livres");
                        System.out.println(mesas.consultarMesasDisp());
                        System.out.println("Informe o número da Mesa: ");
                        num = ler.nextInt();
                        guardaResultadoMetodo = mesas.ocupaMesa("MESA " + num);
                        if(guardaResultadoMetodo.equals("OK")){
                            System.out.println("O cliente pode começar o seu almoço!");
                            buffet.removerDaFila();
                        }else{
                            System.out.println("A Mesa informada está incorreta!");
                        }
                    }
                    break;

                case 4:
                    ler.nextLine();
                    System.out.println("Fila do Caixa.");
                    System.out.println("Informe o número da Mesa em que o cliente estava almoçado: ");
                    num = ler.nextInt();
                    guardaResultadoMetodo = mesas.decupaMesa("MESA " + num);
                    if(guardaResultadoMetodo.equals("OK")){
                        System.out.println("Informe o nome da pessoa que será inserido na fila: ");
                        nome = ler.nextLine();
                        System.out.println(caixa.inserirNaFilaDoCaixa(nome));
                    }
                    break;

                case 5:

                    break;
            }
        } while (opcao != 0);
    }
}
