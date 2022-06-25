//import java.util.ArrayList;

//package javaapplication;

public abstract class CompraCartaoCredito extends CompraCartao {
    
    private int diaFatura;
    //static ArrayList<CompraCartaoCredito>listaCredito = new ArrayList<CompraCartaoCredito>();


    public CompraCartaoCredito(Data data, String idCompra, float valor, Conta conta) {
        super(data, idCompra, valor, conta);
        listaCompra.add(this);

    }
    public int getdiaFatura() {
        return diaFatura;
    }

    public void setdiaFatura(int diaFatura) {
        this.diaFatura = diaFatura;
    }

}