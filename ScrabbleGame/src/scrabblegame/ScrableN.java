package scrabblegame;

import java.util.Scanner;

public class ScrableN {
    public static void newWordFresh(){
       Scanner input = new Scanner(System.in);         
            String userAnswer=input.nextLine();
            if(userAnswer.equalsIgnoreCase("FRESH")){
                System.out.println("Correct");
                newWordPercy();
            }else{
                System.out.println("Try again");
                newWordFresh();
            }
            
}
public static void newWordPercy() {
    Scanner input = new Scanner(System.in); 
         System.out.println("Rearrange the word \n'YPRCE'");
            String userAnswer=input.nextLine();
            
         if(userAnswer.equalsIgnoreCase("PERCY")){
            System.out.println("Correct");
            newWordLimpopo();
         }else{
         System.out.println("Try again");
         newWordPercy();
        }
    }
public static void newWordLimpopo() {
    Scanner input = new Scanner(System.in);
    System.out.println("Rearrange the word \n'PLIPOOM'");
            String userAnswer=input.nextLine();
            
         if(userAnswer.equalsIgnoreCase("LIMPOPO")){
            System.out.println("Correct");
           newWordPrestidge();
         }else{
         System.out.println("Try again");
         newWordLimpopo();
        }
    } 
public static void newWordPrestidge (){
        Scanner input = new Scanner(System.in);
        System.out.println("Rearrange the word\n'respgitde'");
        String userAnswer = input.nextLine();
        
        if(userAnswer.equalsIgnoreCase("Prestidge")) {
            System.out.println("Prestidge");
        }else{
            System.out.println("Try again");
            newWordPrestidge ();
        }
    }
public static void newWordBracket(){
    Scanner input = new Scanner (System.in);
    System.out.println("Rearrange ");
    String userAnswer = input.nextLine();
    
    if (userAnswer.equalsIgnoreCase("")) {
    }
}
    
}
