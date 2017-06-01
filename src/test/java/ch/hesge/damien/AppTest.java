package ch.hesge.damien;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;

public class AppTest 
    extends TestCase
{
    Rules rules = new Rules();
    Dice mockDice5 = Mockito.mock(Dice.class);
    Dice mockDice4 = Mockito.mock(Dice.class);
    Dice mockDice2 = Mockito.mock(Dice.class);
    Dice mockDice1 = Mockito.mock(Dice.class);
    
    Throw throw555 = new Throw(mockDice5, mockDice5, mockDice5);
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testIsWonThrow(){
        when(mockDice4.throwDice()).thenReturn(4);
        when(mockDice2.throwDice()).thenReturn(2);
        when(mockDice1.throwDice()).thenReturn(1);
        when(mockDice5.throwDice()).thenReturn(5);
        Throw throw421 = new Throw(mockDice4, mockDice2, mockDice1);
        assertEquals(true, rules.wonThrow(throw421));
        assertEquals(true, rules.wonThrow(throw555));
    }
    
    public void testIsWonThrowOrderNonDependant(){
        when(mockDice4.throwDice()).thenReturn(4);
        when(mockDice2.throwDice()).thenReturn(2);
        when(mockDice1.throwDice()).thenReturn(1);
        when(mockDice5.throwDice()).thenReturn(5);
        Throw throw421 = new Throw(mockDice2, mockDice4, mockDice1);
        assertEquals(true, rules.wonThrow(throw421));
        assertEquals(true, rules.wonThrow(throw555));
    }
    
    public void testDiceThrow(){
        Dice throwD = new Dice();
        assertEquals(true, (throwD.intVal()<=6&&1<throwD.intVal()));
    }
}