//package javaapplication;

public abstract class CompraCartaoCredito extends CompraCartao {
    
    int diaFatura;

    public CompraCartaoCredito(int data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        this.diaFatura = diaFatura;
        

    }
    public int getdiaFatura() {
        return diaFatura;
    }

    public void setdiaFatura(int diaFatura) {
        this.diaFatura = diaFatura;
    }

}