
public class Monstros {
    private String nome;
    private Integer poder;

    public Monstros(String nome, Integer poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPoder() {
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    public void exibirMonstro() {
        System.out.println("nome:" + nome + " poder:" + poder);
    }

}
