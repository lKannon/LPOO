/*
 * Compra
 */
public class Compra {

    int data;
    String identificador;
    float valor;

    /*
     * public Compra(int data, String identificador, float valor){
     * this.data = data;
     * this.identifiador = identificador;
     * this.valor=valor;
     * }
     */

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra [data=" + data + ", identificador=" + identificador + ", valor=" + valor + "]";
    }

}