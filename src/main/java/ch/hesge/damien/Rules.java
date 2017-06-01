package ch.hesge.damien;

public class Rules {
    
    public Rules(){
        
    }
    
    private boolean is421(Throw diceThrow){
        return (diceThrow.contains(new Dice(4)) && diceThrow.contains(new Dice(2)) && diceThrow.contains(new Dice(1)));
    }
    
    private boolean is555(Throw diceThrow){
        int nb5 = 0;
        for(int i=0; i<diceThrow.size(); i++){
            if(((Dice)diceThrow.get(i)).equals(new Dice(5))){
                nb5++;
            }
        }
        return nb5==3;
    }
    
    protected boolean wonThrow(Throw diceThrow){
        if(is421(diceThrow)){
            return true;
        }else return is555(diceThrow);
    
    }
}
