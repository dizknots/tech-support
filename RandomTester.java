import java.util.Random;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand;
    
    public RandomTester(){
        rand = new Random();
    }
    
    public void printOneRandom(){
        System.out.println(rand.nextInt());
    }
    
    public void printMultiRandom(int howMany){
        for( int i = 0; i < howMany; i++){
            System.out.println(rand.nextInt());
        }
    }
    
    public int throwDice(){
        return rand.nextInt(6)+1;
    }
}
