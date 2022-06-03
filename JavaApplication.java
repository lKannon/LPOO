//package javaapplication;


public class JavaApplication {

    public static void main(String[] args) {
        Conta nuBank = new Conta(1000, "nuBank", 500);
        System.out.println(nuBank.toString());

        CompraCartaoDebito c1 = new CompraCartaoDebito(20220513, "padaria", 15, nuBank);
        System.out.println(nuBank.toString());

        CompraCartaoCreditoAVista c2 = new CompraCartaoCreditoAVista(20220513, "posto", 100f, nuBank, 02);
        System.out.println(nuBank.toString());

        CompraCartaoCreditoParcelada c3 = new CompraCartaoCreditoParcelada(20220513, "cantina", 13f, nuBank, 03, 2, 107f);
        System.out.println(nuBank.toString());
       
        
        
    }
}
