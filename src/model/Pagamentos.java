package model;

public class Pagamentos {
private double valor;
private String dataPagamento;
private String metodoPagamento;

    public Pagamentos(String dataPagamento, String metodoPagamento, double valor) {
        this.dataPagamento = dataPagamento;
        this.metodoPagamento = metodoPagamento;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}