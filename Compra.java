/*
 * Compra
 */
//package javaapplication;
import java.util.ArrayList;
public class Compra {

    private int data;
    private String idCompra;
    private float valor;
    private String nomeBanco;
    private int fatura;
    static ArrayList<Compra> listaCompra = new ArrayList<Compra>();
    
    
    
//Verificar o tipo de compra para o construtor e adicionar a chamada new excluindo a adição de várias compras na lista
     public Compra(int data, String idCompra, float valor, String nomeBanco, int fatura){
        this.data = data;
        this.idCompra   = idCompra   ;
        this.valor = valor;
        this.nomeBanco =nomeBanco;
        this.fatura = fatura;
        //new CompraCartaoCredito(data , Compra, valor, nomeBanco, fatura)
        
        }
    

    public Compra(int data, String idCompra, float valor, String nomeBanco){
        this.data = data;
        this.idCompra = idCompra;
        this.valor = valor;
        this.nomeBanco = nomeBanco;
        listaCompra.add(this);
    }
    public Compra(int data, String idCompra, float valor){
        this.data = data;
        this.idCompra = idCompra;
        this.valor = valor;
        listaCompra.add(this);
    }
    
        

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getidCompra  () {
        return idCompra;
    }

    public void setidCompra(String idCompra) {
        this.idCompra   = idCompra   ;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    

    @Override
    public String toString() {
        return "Compra [data=" + data + ", idCompra=" + idCompra    + ", valor=" + valor + "]";
    }

}