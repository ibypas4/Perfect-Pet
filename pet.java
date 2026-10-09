//Name: Ivy Pascover
//Date: 10/7/26
//Description: find everyones perfect pet based of fav color, season, and name

import java.util.Scanner;

public class pet{
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);

    //asks for color
    System.out.println("Enter your favorite color (Either red, blue or green):");
    String color=(sc.nextLine()).toLowerCase(); //scanner thing here
    if(color!="red"||color!="green"||color!="blue"){
        System.out.println("Enter your favorite color (Either red, blue or green):");

    }
    
    //asks for season
    System.out.println("Enter your favorite season (Either spring, summer, fall, or winter):");
    String season=(sc.nextLine()).toLowerCase(); //scanner thing here
    if(season!="spring"||season!="summer"||season!="fall"||season!="winter"){
        System.out.println("Enter your favorite season (Either spring, summer, fall, or winter):");

    }
    
    //asks for name
    System.out.println("Enter your name:");
    String name=(sc.nextLine()).toLowerCase(); //scanner thing here

        String pet;
        boolean vowel=("AEIOUaeiou".indexOf(name.substring(0,1)))!=-1; //true if name starts with vowel if false then it stats with a constanant

    if (color=="blue"&&season=="fall"){
        pet="Alligator";
    }else if(color=="blue"&&season=="spring"){
        pet="Ostrich";
    }else if(color=="green"&&!vowel&&season=="winter"){
       pet="Giraffe"; 
    }else if(color=="green"&&season!="fall"){
       pet="Dog"; 
    }else if(color=="red"&&vowel){
       pet="Porcupine"; 
    }else if(color=="red"){
       pet="Panda"; 
    }else if(season=="summer"){
       pet="Pony"; 
    }else if(!vowel&&color=="blue"&&season!="summer"&&season!="fall"){
       pet="Axolotl"; 
    }else {
       pet="Rock"; 
    }

    System.out.println("Your perfect pet is: "+pet);



    }
}
