import java.util.*;
public class Ambitious_Kid {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int mini = Integer.MAX_VALUE; // Initialize to maximum value
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
      mini = Math.min(mini, Math.abs(arr[i]));
    }
    System.out.println(mini);
    sc.close();  
  }
}
