package Atividade2;

public class Camiseta extends Roupa {
    private String tamanho;
    private String cor;

    public Camiseta(String nome, double preco, String tamanho, String cor) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    String getDescricao() {
        return "Camiseta " + getNome() + " (Tamanho: " + tamanho + ", Cor: " + cor + ")";
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
