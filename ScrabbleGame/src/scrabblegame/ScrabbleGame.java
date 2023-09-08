
package scrabblegame;

import java.util.Scanner;

public class ScrabbleGame {
public static void scan(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to play");
        String userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("yes")){
            System.out.println("Press one to continue");
        }
       int index = input.nextInt();
       
        if(index == 1){
            System.out.println("Rearrange the word'REFHS'");
            ScrableN.newWordFresh();
        }else{
         System.out.println("Try again");
      }
}



}
  

