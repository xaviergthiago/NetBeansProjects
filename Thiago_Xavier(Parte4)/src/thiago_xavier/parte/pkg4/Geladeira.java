package thiago_xavier.parte.pkg4;

public class Geladeira {

    byte portas;
    short quantidade;
    long codigo;
    float preco;

    public void setPortas(byte pt) {
        if (pt==1 || pt==2){
        portas=pt;
        }else{
            portas=1;
        }
    }

    public void setQuantidade(short q) {
        quantidade = q;
    }

    public void setCodigo(long c) {
        codigo = c;
    }

    public void setPreco(float p) {
        preco = p;
    }

    public byte getPortas() {
        return portas;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public float getPreco() {
        return preco;
    }

}
