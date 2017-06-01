package ch.hesge.damien;

public class Game {
    private Player player1;
    private Player player2;
    private Rules rules;
    public Game(){
        player1 = new Player();
        player2 = new Player();
        rules = new Rules();
    }
    
public int isPlayed(){
        int won = 0;
        while(won == 0){
            for(int i = 0; i<3; i++){
                System.out.println("");
                if(rules.wonThrow(player1.throwDices())){
                    won = 1;
                    return won;
                }           
            }
            System.out.println("---------");
            for(int i = 0; i<3; i++){
                System.out.println("");
                if(rules.wonThrow(player2.throwDices())){
                    won = 2;
                    return won;
                }
            }
            System.out.println("---------");
        }
        return won;
    }
}
