//package javaapplication;


public class JavaApplication {

    public static void main(String[] args) {
        Conta nuBank = new Conta(1000f, "NuBank", 500f);

       
        for (int i = 0; i < Compras.listaCompra.size(); i++){
            System.out.println(Compras.listaCompra.get(i));
        }
    }
           
}
