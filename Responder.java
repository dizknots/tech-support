import java.util.Random;
import java.util.HashMap;
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
    private HashMap<String, String> responses;
    private Random rand;
    public Responder()
    {
        rand = new Random();
        responses = new HashMap<>();
        fillResponsesMap();
    }
    
    private void fillResponsesMap(){
       responses.put("hi", "hello"); 
       responses.put("lol", "lel");
       responses.put("wyd", "nth");
    }
    
    private String pickDefaultResponse(){
        return "idk";
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String answer = responses.get(word);
        if(answer == null){
            answer = pickDefaultResponse();
        }
        return answer;
    }
}
