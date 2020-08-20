import java.util.Scanner;
/**
 * driver for bowler
 *
 * @author Isaac altice
 * @version 01/30/2019
 */
public class BowlerDriver
{
    public static void main (String[] args){
        Bowler b1;
        b1 = new Bowler();
        Bowler b2;
        b2 = new Bowler();
        Scanner in = new Scanner(System.in);
        
        String name1;
        String name2;
        int score1;
        int score2;
        int score3;
        
        System.out.println("Enter the first bowlers name: ");
        name1 = in.nextLine();
        System.out.println("Enter the first score: ");
        score1 = in.nextInt();
        System.out.println("Enter the second score: ");
        score2 = in.nextInt();
        System.out.println("Enter the third score: ");
        score3 = in.nextInt();
        
        b1.setFullName1(name1);
        b1.setScore1(score1);
        b1.setScore2(score2);
        b1.setScore3(score3);
        b1.calcAverage(score1,score2,score3);
        in.nextLine();
        System.out.println("Enter the second bowlers name: ");
        name2 = in.nextLine();
        
        System.out.println("Enter the first score: ");
        score1 = in.nextInt();
        System.out.println("Enter the second score: ");
        score2 = in.nextInt();
        System.out.println("Enter the third score: ");
        score3 = in.nextInt();
        
        b2.setFullName2(name2);
        b2.setScore1(score1);
        b2.setScore2(score2);
        b2.setScore3(score3);
        b2.calcAverage(score1,score2,score3);
        
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        System.out.println("Change the scores of both bowlers");
        System.out.println("First bowler");
        System.out.println("Enter the first score: ");
        score1 = in.nextInt();
        System.out.println("Enter the second score: ");
        score2 = in.nextInt();
        System.out.println("Enter the third score: ");
        score3 = in.nextInt();
        
        b1.setScore1(score1);
        b1.setScore2(score2);
        b1.setScore3(score3);
        b1.calcAverage(score1,score2,score3);
        
        System.out.println("Second Bowler");
        System.out.println("Enter the first score: ");
        score1 = in.nextInt();
        System.out.println("Enter the second score: ");
        score2 = in.nextInt();
        System.out.println("Enter the third score: ");
        score3 = in.nextInt();
        
        b2.setScore1(score1);
        b2.setScore2(score2);
        b2.setScore3(score3);
        b2.calcAverage(score1,score2,score3);
        if (b1.getAverage() == b2.getAverage()){
            System.out.println(b1.getFullName() + " and " + b2.getFullName() + " have the same average, " + b1.getAverage());
    }
        else if (b1.getAverage() > b2.getAverage()){
            System.out.println(b1.getFullName() + " has a higher average. Their scores are " + b1.getAverage() + " and " + b2.getAverage());
            
    }
        else{
            System.out.println(b2.getFullName() + " has a higher average. Their scores are " + b2.getAverage() + " and " + b1.getAverage());
    }
    
        
    }
}
