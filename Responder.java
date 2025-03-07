import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    private ArrayList<String> responses;
    private Random rand;
    public Responder()
    {
        rand = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }
    
    private void fillResponses(){
        responses.add("Hello");
        responses.add("How can I help you?");
        responses.add("Try again later");
        responses.add("Nice");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        if (responses.isEmpty()){
            return "No responses availabe";
        }
        int index = rand.nextInt(responses.size());
        return responses.get(index);
    }
}
