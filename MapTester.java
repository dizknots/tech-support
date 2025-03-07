import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *
 *
 *
 */
public class MapTester
{
    private HashMap<String, String> contacts;
    
    public MapTester(){
        contacts = new HashMap();
        contacts.put("Joe","1");
        contacts.put("Bob","2");
        contacts.put("John","3");
        contacts.put("Jane","4");
    }
    
    public void enterNumber(String name, String number){
        contacts.put(name, number);
    }
    
    public String lookupNumber(String name){
        return contacts.get(name); 
    }
    
    
}
