import java.util.Scanner;
/**
 * A program to get 3 scores of 2 bowlers then compare their averages
 *
 * @author isaac altice
 * @version 01/30/2019
 */
public class Bowler
{
    private String fullName;
    private int age;
    private int score1;
    private int score2;
    private int score3;
    private double average;
    Scanner in = new Scanner(System.in);
    
    public Bowler(){
     fullName = null;
     age = 0;
     score1 = 0;
     score2 = 0;
     score3 = 0;
    }
    public Bowler(String fullName, int age, int score1, int score2, int score3){
        calcAverage(score1, score2, score3);
        
    }
    public double calcAverage(int score1, int score2, int score3){
        average = (score1 + score2 + score3) / 3;
        return average;
    }
    public String getFullName(){
     return fullName;   
    }
    public int getScore1(){
     return score1;   
    }
    public int getScore2(){
     return score2;   
    }
    public int getScore3(){
     return score3;   
    }
    public double getAverage(){
     return average;   
    }
    public void setFullName1(String name){
     fullName = name;   
    }
    public void setFullName2(String name){
     fullName = name;   
    }
    public void setAge(int ageNum){
     age = ageNum;
    }
    public void setScore1(int score1Test){
        
     
         score1 = score1Test;
     if(score1 < 0 || score1 >300){
         System.out.println("Invalid score entered, it will not be save");
         score1 = 0;
        }
        
    
    }
    public void setScore2(int score2Test){
     
         
         score2 = score2Test;
     if(score2 < 0 || score2 >300){
         System.out.println("Invalid score entered, it will not be save");
         score2 = 0;
        }
        
   
    }
    public void setScore3(int score3Test){
     
         
         score3 = score3Test;
     if(score3 < 0 || score3 >300){
         System.out.println("Invalid score entered, it will not be save");
         score3 = 0;
         
        }
        
    
    }
    public String toString(){
        
     return    fullName + " has a bowling average of " + average + "\n";
    }
}
