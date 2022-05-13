public class Conta {
    float limite;
    float limiteDisponivel;
    float saldo;
    float taxaMensal;
    //float valor;
    //int data; //ex: 20220513
    int diaFatura;
    //String idCompra; //ex: estabelecimento
    String nomeBanco;


    
    public Conta(float limite, float limiteDisponivel, float saldo, float taxaMensal, int diaFatura, String nomeBanco) {
        this.limite = limite;
        this.limiteDisponivel = limiteDisponivel;
        this.saldo = saldo;
        this.taxaMensal = taxaMensal;
        this.diaFatura = diaFatura;
        this.nomeBanco = nomeBanco;
    }



    @Override
    public String toString() {
        return "Conta [diaFatura=" + diaFatura + ", limite=" + limite + ", limiteDisponivel=" + limiteDisponivel
                + ", nomeBanco=" + nomeBanco + ", saldo=" + saldo + ", taxaMensal=" + taxaMensal + "]";
    }



    



}
