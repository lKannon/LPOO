/*
 * Compra
 */
//package javaapplication;
import java.util.ArrayList;
public abstract class Compras {

    private int data;
    private String idCompra;
    private float valor;
    static ArrayList<Compras> listaCompra;
    
     public Compras(int data, String idCompra   , float valor){
        this.data = data;
        this.idCompra   = idCompra   ;
        this.valor=valor;
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
    //Adicionar compra *****************************************
    

    @Override
    public String toString() {
        return "Compra [data=" + data + ", idCompra=" + idCompra    + ", valor=" + valor + "]";
    }

}