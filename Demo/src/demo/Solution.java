package demo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class car{
    public int no_of_tires=4;
    public String bodyType="Plastic";
    public void reverseGear()
    {
        System.out.println("Reverse gear is applied....");
    }
    public void switchOnHeadlights(){
        System.out.println("Headlights turned on...");
    }
}
 class BMW extends car{
    public String modelName="X3";
    public void topSpeed()
    {
        System.out.println("TopSpeed of BMW is 200 kmph");
    }
}

 public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = sc.nextLine();
            BMW b = new BMW();
            if(name.equals("reverseGear")){
                b.reverseGear();
            }
            if(name.equals("switchOnHeadlights")){
                b.switchOnHeadlights();
            }
            if(name.equals("topSpeed")){
                b.topSpeed();
            }
        }
    }
}