package model;

public class Quartos {
    private double valorDiaria;
    private int numero;
    private boolean status;
    private String tipo;


    public Quartos(int numero, boolean status, String tipo, double valorDiaria) {
        this.numero = numero;
        this.status = status;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
    }


    public Quartos(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.status = false; 
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupado() {
        return status;
    }

    public void setOcupado(boolean ocupado) {
        this.status = ocupado;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
