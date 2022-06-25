import java.util.ArrayList;

//package javaapplication;

public class CompraCartaoCreditoParcelada extends CompraCartaoCredito {
    private int nParcelas;
    private float valorTotal; //Possivelmente é o valor da parcela

    public CompraCartaoCreditoParcelada (Data data, String idCompra, float valor, Conta conta, int nParcelas) {
        super(data, idCompra, valor, conta);
        this.nParcelas = nParcelas;
    }

    public CompraCartaoCreditoParcelada(listaCompras, String idCompra, float valor, Conta conta, int nVezes) {
    }

    public int getnParcelas() {
        return nParcelas;
    }



    public void setnParcelas(int nParcelas) {
        this.nParcelas = nParcelas;
    }



    public float getValorTotal() {
        return valorTotal;
    }



    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }



    public void calcValorParcela(){
        setValorTotal(getnParcelas());
    }
}  
   