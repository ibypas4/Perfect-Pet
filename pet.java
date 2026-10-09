//Name: Ivy Pascover
//Date: 10/7/26
//Description: find everyones perfect pet based of fav color, season, and name

import java.util.Scanner;

public class pet{
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    String color="1";
    String season="1";
    String name="1";

    //asks for color
    while (!(color.equals("red")||color.equals("green")||color.equals("blue"))){
        System.out.println("Enter your favorite color (Either red, blue or green):");
        color=(sc.nextLine()).toLowerCase();

    }
    
    //asks for season
    while (!(season.equals("spring")||season.equals("summer")||season.equals("fall")||season.equals("winter"))){
        System.out.println("Enter your favorite season (Either spring, summer, fall, or winter):");
        season=(sc.nextLine()).toLowerCase();

    }
    
    //asks for name until it starts with a letter
    while (!("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0)){
         System.out.println("Enter your name:");
         name=(sc.nextLine()).toLowerCase();
    }



        String pet;
        //true if name starts with vowel if false then it stats with a constanant
        boolean vowel=("AEIOUaeiou".indexOf(name.substring(0,1)))!=-1; 

    if (color.equals("blue")&&season.equals("fall")){
        pet="Alligator";
    }else if(color.equals("blue")&&season.equals("spring")){
        pet="Ostrich";
    }else if(color.equals("green")&&!vowel&&season.equals("winter")){
       pet="Giraffe"; 
    }else if(color.equals("green")&& !season.equals("fall")){
       pet="Dog"; 
    }else if(color.equals("red")&&vowel){
       pet="Porcupine"; 
    }else if(color.equals("red")){
       pet="Panda"; 
    }else if(season.equals("summer")){
       pet="Pony"; 
    }else if(!vowel&&color.equals("blue")&&season.equals("winter")){
       pet="Axolotl"; 
    }else {
       pet="Rock"; 
    }

    System.out.println("Your perfect pet is: "+pet);

    }
}
