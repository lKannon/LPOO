public class CompraDebito extends Compra {
    String idCartao;

    public CompraDebito(String idCartao, int data, String identificador, float valor) {
        this.idCartao = idCartao;
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
}