//package javaapplication;

public class Conta implements InterfConta {
    private float saldo;
    private String nomeBanco;
    private float limite;
    private float limiteDisponivel;
    private int diaFatura;
    private float taxaMensal;

    
   public Conta(float saldo, String nomeBanco, float limite){
       this.saldo = saldo;
       this.nomeBanco = nomeBanco;
       this.limite = limite;
   }

    public float getSaldo() {
    return saldo;
}
//Getters n Setters

public void setSaldo(float saldo) {
    this.saldo = saldo;
}

public String getNomeBanco() {
    return nomeBanco;
}

public void setNomeBanco(String nomeBanco) {
    this.nomeBanco = nomeBanco;
}

public float getLimite() {
    return limite;
}

public void setLimite(float limite) {
    this.limite = limite;
}

public float getLimiteDisponivel() {
    return limiteDisponivel;
}

public void setLimiteDisponivel(float limiteDisponivel) {
    this.limiteDisponivel = limiteDisponivel;
}

public int getDiaFatura() {
    return diaFatura;
}

public void setDiaFatura(int diaFatura) {
    this.diaFatura = diaFatura;
}

public float getTaxaMensal() {
    return taxaMensal;
}

public void setTaxaMensal(float taxaMensal) {
    this.taxaMensal = taxaMensal;
}

public void debitar(float valor){
    setSaldo(getSaldo()-valor);
}

public void reterLimiteDisp(float valor){//O que faz essa func?
    setLimiteDisponivel(getLimiteDisponivel()-valor);
}

public void devolverLimiteDisp(float valor){//O que faz essa func?
    setLimiteDisponivel(getLimiteDisponivel()+valor);
}
   
    @Override
    public String toString() {
        return "Conta [diaFatura=" + diaFatura + ", limite=" + limite + ", limiteDisponivel=" + limiteDisponivel
                + ", nomeBanco=" + nomeBanco + ", saldo=" + saldo + ", taxaMensal=" + taxaMensal + "]";
    }

}
