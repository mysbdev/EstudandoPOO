
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Heroi> personagens = new ArrayList<>();
        Monstros primeiro = new Monstros("Behemont", 10);
        Monstros segundo = new Monstros("Milotic", 8);

        while (true) {
            System.out.println("---- Guilda");
            System.out.println("---- Escolha uma opção");
            System.out.println("---- 1.Crie um Guerreiro.");
            System.out.println("---- 2.Crie um Mago.");
            System.out.println("---- 3.Mostrar personagens criados.");
            System.out.println("---- 4.Excluir personagem criado.");
            System.out.println("---- 5.Duelo.");
            System.out.println("---- 6.Sair.");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Nome do Guerreiro:");
                    String nomeG = scanner.nextLine();
                    System.out.println("Escolha a arma do Guerreiro:");
                    System.out.println("1.Espada");
                    System.out.println("2.Lança");
                    System.out.println("3.Adaga");
                    System.out.println("4.Martelo");
                    System.out.println("5.Machado");
                    System.out.println("6.Punho");
                    Integer arminha = scanner.nextInt();
                    System.out.println("Arma escolhida foi " + EArma.values()[arminha - 1]);
                    Lutador guerreiro = new Lutador(nomeG, 1, EArma.values()[arminha - 1]);
                    personagens.add(guerreiro);
                    System.out.println("Guerreiro Criado!!!");
                    guerreiro.atacar();

                    break;
                case 2:
                    System.out.println("Nome do Mago:");
                    String nomeM = scanner.nextLine();
                    System.out.println("Magia do Mago:");
                    String magiaM = scanner.nextLine();
                    Arcano mago = new Arcano(nomeM, 1, magiaM);
                    personagens.add(mago);
                    System.out.println("Mago Criado!!!");
                    mago.atacar();
                    break;
                case 3:
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum Personagem Criado.");
                    } else {
                        for (int i = 0; i < personagens.size(); i++) {
                            System.out.println((i + 1) + ".");
                            personagens.get(i).exibirInfo();
                        }
                    }
                    break;
                case 4:
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum Personagem para excluir.");
                    } else {
                        System.out.println("Digite o número do personagem para excluir.");
                        int indice = scanner.nextInt() - 1;
                        if (indice >= 0 && indice < personagens.size()) {
                            personagens.remove(indice);
                            System.out.println("Personagem excluido!!!");
                        } else {
                            System.out.println("Índice inválido!!!");
                        }
                    }
                    break;
                case 5:
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum personagem criado.");
                    }
                    System.out.println("Escolha contra quem vai lutar.");
                    System.out.println("Monstro 1 ou 2?");
                    int duelo = scanner.nextInt();
                    scanner.nextLine();
                    switch (duelo) {
                        case 1:
                            System.out.println("Escolha seu personagem pelo nome.");
                            String duelista = scanner.nextLine();
                            Heroi escolhido = null;
                            for (Heroi p : personagens) {
                                if (p.getNome().equalsIgnoreCase(duelista)) {
                                    escolhido = p;
                                    break;
                                }
                            }
                            if (escolhido == null) {
                                System.out.println("Personagem não encontrado");
                                break;
                            }
                            System.out.println("lutarar contra: ");
                            primeiro.exibirMonstro();
                            break;
                        case 2:
                            System.out.println("Escolha seu personagem pelo nome.");
                            String heroi = scanner.nextLine();
                            Heroi choice = null;
                            for (Heroi p : personagens) {
                                if (p.getNome().equalsIgnoreCase(heroi)) {
                                    choice = p;
                                    break;
                                }
                            }
                            if (choice == null) {
                                System.out.println("Personagem não encontrado!!");
                            }
                            System.out.println("lutara contra: ");
                            segundo.exibirMonstro();
                            break;
                        case 3:
                            System.out.println("Escolha seu personagem pelo nome.");
                            String killer = scanner.nextLine();
                            Heroi selecionado = null;
                            for (Heroi p : personagens) {
                                if (p.getNome().equalsIgnoreCase(killer)) {
                                    selecionado = p;
                                    break;
                                }
                            }
                            if (selecionado == null) {
                                System.out.println("Personagem não encontrado!!");
                            }
                            System.out.println("lutara contra: ");
                            segundo.exibirMonstro();
                    }
                    break;

                case 6:
                    System.out.println("Saindo....");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção Inválida!!!!!!!");
            }

        }

    }
}
