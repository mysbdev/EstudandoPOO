public abstract class Heroi {
    private String nome;
    private EClasses classe;
    private Integer nivel;

    public Heroi(String nome, EClasses classe, Integer nivel) {
        setClasse(classe);
        setNivel(nivel);
        setNome(nome);
    }

    public void exibirInfo() {
        System.out.println("nome:" + nome + " classe:" + classe + " nível:" + nivel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EClasses getClasse() {
        return classe;
    }

    public void setClasse(EClasses classe) {
        this.classe = classe;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel++;
    }

    public void upar() {
        setNivel(1);
        System.out.println(nome + " subiu para nivel " + nivel + "!");
    }

}
