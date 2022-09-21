
import java.util.scanner;

public class TextAdventure{
public static void main(string[] args) {
Scanner input = new Scanner(System.in);
int areaCode=1;
int choice;
While(areaCode!=-1){
switch(areaCode){
case1:
System.out.println("Your journeying down the road near a forest");
System.out.println("Ahead of you the road continous, to the left there is a path leading to the forest");
System.out.println("\t1. keep traveling to the main path");
System.out.println("\t2. Go deeper into the forest");
int choice= input.nextInt();
If(choice==1){
areaCode=2;
}
else if(choice==2) {
areaCode=3;
}
break;
default:
areaCode=-1;
}
break;
case 2:
System.out.println("You see a village!");
System.out.println("what would you like to do?");
System.out.println("\t1. Rest at the inn");
System.out.println("\t2. Look at the billboard");
System.out.println("\t3. Head back");
Choice= input.nextInt();
break;
Case 3: 
System
}

}
}