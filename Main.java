import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    Squaremaker sm = new Squaremaker();
    try{
    System.out.println("Welcome to Square maker!");
    System.out.println("Enter the number of hashes on one side: ");
    int n = sc.nextInt();
    sm.maker(n); 
    sc.close();
    }
    catch(Exception e){
      System.out.println("Something went wrong");
    } 
  }
  
}