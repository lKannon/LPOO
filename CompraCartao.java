//package javaapplication;

public abstract class CompraCartao extends Compras {
    
    private Conta conta;

    public CompraCartao(Data data, String idCompra, float valor, Conta conta){
        super(data, idCompra, valor);
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "CompraCartao [conta=" + conta + "]";
    }
    
}
