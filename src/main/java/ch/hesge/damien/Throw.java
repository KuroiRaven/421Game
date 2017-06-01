package ch.hesge.damien;

import java.util.ArrayList;
import java.util.List;

public class Throw {
    private List diceList;
    private final int NB_DICE = 3;
    
    public Throw(){
        this.diceList = new ArrayList(NB_DICE);
        for(int i=0; i<NB_DICE; i++){
            Dice dice = new Dice();
            diceList.add(dice);
            System.out.print(dice);
        }
    }
    
    public Throw(Dice diceA, Dice diceB, Dice diceC){
        this.diceList = new ArrayList(NB_DICE);
        diceList.add(diceA);
        diceList.add(diceB);
        diceList.add(diceC);
    }
    
    public int size(){
        return diceList.size();
    }
    
    public Object get(int i){
        return diceList.get(i);
    }
    
    public boolean contains(Object obj){
        return diceList.contains(obj);
    }
}
