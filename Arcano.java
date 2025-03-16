public class Arcano extends Heroi {
    private String magia;

    public Arcano(String nome, int nivel, String magia) {
        super(nome, EClasses.mago, nivel);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public void atacar() {
        System.out.println(getNome() + " ataca com magia " + magia + "!");
    }
}