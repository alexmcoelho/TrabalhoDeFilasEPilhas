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

        int opcao;
        int num;
        String nome;
        String guardaResultadoMetodo;
        float valor;
        int opcaoRelatorio;


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
            System.out.printf("[ 7 ] Relatórios \n");
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
                    do Restaurante e removerá um prato da pilha
                     */
                    if(pratos.verificaPilhaDePratos() == false){
                        System.out.println("Não possui pratos na pilha!");
                    }else if(filaClientesR.verificaFila() == false){
                        System.out.println("Está furando fila");
                    }else{
                        System.out.println(buffet.inserirNaFila(filaClientesR.pegaPrimeiroElemento()));
                        filaClientesR.removerDaFila();
                        pratos.desinpillhar();
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
                    ler.nextLine();
                    if(caixa.verificaFilaCaixa() == false){
                       System.out.println("Primeiro o cliente tem que ser inserido na fila do Caixa!");
                    }else {
                        System.out.println("Informe a valor total de gastos do cliente");
                        valor = ler.nextFloat();
                        System.out.println(caixa.removerDaFilaDoCaixa(valor));
                    }
                    break;
                case 6:
                    ler.nextLine();
                    System.out.println("Informe a quantidade de pratos: ");
                    num = ler.nextInt();
                    System.out.println(pratos.reposicaoDePratos(num));
                    break;
                case 7:
                    do {
                        ler.nextLine();
                        System.out.printf("\n**** Menu dos Relatórios*****\n");
                        System.out.printf("[ 1 ] Total do valor Caixa\n");
                        System.out.printf("[ 2 ] Número de pessoas na fila para almoçar\n");
                        System.out.printf("[ 3 ] Número de pessoas na fila do caixa\n");
                        System.out.printf("[ 4 ] Número de pessoas no restaurante almoçando\n");
                        System.out.printf("[ 5 ] Número de pessoas atendidas\n");
                        System.out.printf("[ 6 ] Número de pratos na pilha\n");
                        System.out.printf("[ 7 ] Número de pratos na pilha\n");
                        System.out.printf("[ 8 ] Número de mesas livres\n");
                        System.out.printf("[ 0 ] Sair\n");
                        System.out.printf("\nOpção Desejada: ");
                        opcaoRelatorio = ler.nextInt();

                        switch (opcaoRelatorio) {
                            case 1:
                                System.out.println("Total valor -> " + caixa.valorMovimentado());
                                break;
                            case 2:
                                System.out.println("Quantidade de pessoas -> " + filaClientesR.numDePessoasQueEstaoNaFilaRest());
                                break;
                            case 3:
                                System.out.println("Quantidade de pessoas -> " + caixa.qtdPessoasFilaDoCaixa());
                                break;
                            case 4:
                                System.out.println("Quantidade de pessoas -> " + mesas.qtdPessoasAlmocando());
                                break;
                            case 5:
                                System.out.println("Quantidade de pessoas -> " + caixa.qtdPessoasAtendidas());
                                break;
                            case 6:
                                System.out.println("Quantidade de pratos -> " + pratos.qtdPratosNaPilha());
                                break;
                            case 7:
                                System.out.println("Quantidade de mesas -> " + mesas.qtdMesasDisponiveis());
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }while(opcaoRelatorio != 0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
}
