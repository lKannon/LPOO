//package javaapplication;

public class CompraCartaoCreditoParcelada extends CompraCartaoCredito {
    int nParcelas;
    float valorParcela;

    public CompraCartaoCreditoParcelada (int data, String idCompra, float valor, Conta conta,int diaFatura, int nParcelas, float valorParcela) {
        super(data, idCompra, valor, conta, diaFatura);
        this.nParcelas = nParcelas;
        this.valorParcela = valorParcela;

    }

    public int getnParcelas() {
        return nParcelas;
    }

    public void setnParcelas(int nParcelas) {
        this.nParcelas = nParcelas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

}  
   