package classes.part9.ex1;

public class Geladeira {

    private byte portas;
    private short quantidade;
    private long codigo;
    private float preco;

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
