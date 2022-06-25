//import java.util.ArrayList;

//package javaapplication;

public class CompraCartaoDebito extends CompraCartao {
    //static ArrayList<CompraCartaoDebito> listaCompraDebito = new ArrayList<CompraCartaoDebito>();

    public CompraCartaoDebito(Data data, String idCompra, float valor, Conta conta) {
       super(data, idCompra, valor, conta);
       listaCompra.add(this);
       
    }
  
}
