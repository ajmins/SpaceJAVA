package udemyPractices.PracticeChallengesl;

import java.lang.reflect.Field;

public class HoldMyBeer 
{
    final int notSoFinal;
    
    public HoldMyBeer()
    {
       notSoFinal = 1;
    }

    static void holdIt(HoldMyBeer beer, int yetAnotherFinalValue) throws Exception
    {
       Class<HoldMyBeer> cl = HoldMyBeer.class;
       Field field = cl.getDeclaredField("notSoFinal");
       field.setAccessible(true);
       field.set(beer, yetAnotherFinalValue);
    }

    public static void main(String[] args) throws Exception 
    {
       HoldMyBeer beer = new HoldMyBeer();
       System.out.println(beer.notSoFinal);
       holdIt(beer, 50);
       System.out.println(beer.notSoFinal);
       holdIt(beer, 100);
       System.out.println(beer.notSoFinal);
       holdIt(beer, 666);
       System.out.println(beer.notSoFinal);
       holdIt(beer, 8888);
       System.out.println(beer.notSoFinal);
    }    
}
