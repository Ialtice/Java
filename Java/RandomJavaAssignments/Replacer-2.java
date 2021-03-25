
/**
 * a program to replace spaces in a sentence with the word blank
 *
 * @author Isaac Altice
 * @version 2/6/2019
 */
public class Replacer
{
    private String original;
    private StringBuilder workOn;
    private String converted;
    
    public Replacer(String inOriginal){
        setOriginal(inOriginal);
        workOn = new StringBuilder(original);
    }
    public Replacer(){
     original = "empty";  
     workOn = new StringBuilder(original);
    }
    public String replace(String inReplacement, char inRemove){
        for(int i = workOn.length() -1; i >0;i--){
         if (original.charAt(i) == inRemove){
             workOn.replace(i,i+1, inReplacement);
            }
        }
        converted = workOn.toString();
        return converted;
    }
    public void setOriginal(String originalSentence){
     original = originalSentence; 
    }
    public String getOriginal(){
     return original;   
    }
    public String getConverted(){
     return converted;
    }
    public String toString(){
     return "Orginal Sentence: " + original + "\nConverted Sentence: " + converted; 
    }
    
    
}
