package filaDoCaixa;

import com.FilasEPilhas.Lista;

/**
 * Created by Alex on 29/03/2016.
 */
public class ListaCaixa extends Lista{
    private String nome;
    private float valor;
    private int contadorPesAtendidas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getContadorPesAtendidas() {
        return contadorPesAtendidas;
    }

    public void setContadorPesAtendidas(int contadorPesAtendidas) {
        this.contadorPesAtendidas = contadorPesAtendidas;
    }
}

