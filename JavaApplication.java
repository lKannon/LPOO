//package javaapplication;


public class JavaApplication {

    public static void main(String[] args) {
        Conta nuBank = new Conta(1000f, "NuBank", 500f);

        new Compra(20220513, "padaria", 15f);
        new Compra(20220513, "padaria", 15f, "Nubank");
        new Compra(20220513, "padaria", 15f, "Nubank",11 );

        for (int i = 0; i < Compra.listaCompra.size(); i++){
            System.out.println(Compra.listaCompra.get(i));
        }
    }
           
}
