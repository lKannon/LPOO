/*
 * Compras
 */
//package javaapplication;
import java.util.ArrayList;
public class Compras {

    private Data data;
    private String dataStr;
    private String idCompra;
    private float valor;
    static ArrayList<Compras> listaCompra = new ArrayList<Compras>();
    
    
    
    
//Verificar o tipo de compra para o construtor e adicionar a chamada new excluindo a adição de várias compras na lista
     public Compras(Data data, String idCompra, float valor, String Conta, int nParcelas){
        this.data = data;
        this.idCompra   = idCompra   ;
        this.valor = valor;
        listaCompra.add(this);
        //new CompraCartaoCredito(data , Compras, valor, nomeBanco, fatura)
        
        }
    

    public Compras(Data data, String idCompra, float valor, String Conta){
        this.data = data;
        this.idCompra = idCompra;
        listaCompra.add(this);
    }
    public Compras(Data data, String idCompra, float valor){
        this.data = data;
        this.idCompra = idCompra;
        this.valor = valor;
        listaCompra.add(this);
    }
    
        

}