public class CompraCreditoParcelado extends Compra {
    String idCartao;
    int mesFatura;
    int nVezes;

    public CompraCreditoParcelado (String idCartao, int mesFatura, int nVezes, int data, String identificador, float valor) {
        this.idCartao = idCartao;
        this.mesFatura = mesFatura;
        this.nVezes = nVezes;
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

    public int getnVezes() {
        return nVezes;
    }

    public void setnVezes(int nVezes) {
        this.nVezes = nVezes;
    }

}