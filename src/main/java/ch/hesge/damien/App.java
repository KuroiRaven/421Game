package ch.hesge.damien;

public class App {    
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Partie gagnée par : Joueur"+game.isPlayed());
    }
}
