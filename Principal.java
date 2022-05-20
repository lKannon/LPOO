public class Principal {
    public static void main(String[] args) {
        CompraDebito CD1 = new CompraDebito("123", 01, "padaria", 2.0f) ;
        //CompraCreditoParcelado CCP1 = new CompraCreditoParcelado(02, 05, 2, 1205, "Master", 1200.00);
        
        Conta conta1 = new Conta(5000, 2500, 3500, 0, 01112022, "baba");


        System.out.println(CD1.toString());
        System.out.println(conta1.toString());

    }
}
