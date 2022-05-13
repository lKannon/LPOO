public class CompraCredito extends Compra {
    String idCartao;
    int mesFatura;

    public CompraCredito(String idCartao, int mesFatura, int data, String identificador, float valor) {
        this.idCartao = idCartao;
        this.mesFatura = mesFatura;
        this.data = data;
        this.identificador = identificador;
        this.valor=valor;
    }

    public String getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(String idCartao) {
        this.idCartao = idCartao;
    }

    public int getMesFatura() {
        return mesFatura;
    }

    public void setMesFatura(int mesFatura) {
        this.mesFatura = mesFatura;
    }

}