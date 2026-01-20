import java.util.*;
public class Buttons{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    while(t-->0){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int first = 0, second = 0;
      first+= c/2 + c%2 + a;
      second+=c/2 + b;

      if(first > second)
        System.out.println("First");
      else
        System.out.println("Second");
    }
    sc.close();
  }
} 
