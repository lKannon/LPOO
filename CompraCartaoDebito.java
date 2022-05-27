//package javaapplication;

public class CompraCartaoDebito extends CompraCartao {
    

    public CompraCartaoDebito(int data, String idCompra, float valor, Conta conta) {
       super(data, idCompra, valor, conta);
       
       
    }

    public void debitar(float valor, Conta conta){
        conta.setSaldo(conta.getSaldo()-valor);
    
}
}