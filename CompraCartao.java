public class CompraCartao extends Compra {
    
    String nomeBanco;

    public CompraCartao(int data, String idCompra, float valor, Conta conta){
        super(data, idCompra, valor, conta);
        this.nomeBanco = nomeBanco;
    }

    public String getnomeBanco(){
        return nomeBanco;
    }

    public void setnomeBanco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }
    
}
