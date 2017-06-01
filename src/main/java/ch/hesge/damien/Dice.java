package ch.hesge.damien;

public class Dice {
    private static final int MAXIMUM = 6;
    
    private int value;
    
    public Dice(){
        value = throwDice();
    }
    
    public Dice(int val){
        this.value = val;
    }
    
    public int throwDice(){
        return (int) Math.ceil(Math.random() * MAXIMUM);
    }
    
    public int intVal(){
        return value;
    }
    
    @Override
    public String toString(){
        return value+"";
    }
    
    @Override
    public boolean equals(Object obj){
        return (this.intVal() == ((Dice)obj).intVal());
    }
    
}
