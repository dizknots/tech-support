import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random rand;
    private ArrayList<String> responses;
    
    public RandomTester() {
        rand = new Random();
        responses = new ArrayList<>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
    }

    public void printOneRandom() {
        System.out.println(rand.nextInt());
    }

    public void printMultiRandom(int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(rand.nextInt());
        }
    }
    
    public int throwDice(){
        return rand.nextInt(6)+1;
    }
    
    public String getResponse(){
        return responses.get(rand.nextInt(responses.size()));
    }
    
    public int getRandomNumber(int min, int max){
        return rand.nextInt((min-max) + 1) + min;
    }
    
}

