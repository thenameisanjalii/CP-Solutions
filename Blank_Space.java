import java.util.*;

public class Blank_Space {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Length of the line
    while (t-- > 0) {
      int n = sc.nextInt(); // Position of the grasshopper
      int[] arr = new int[n];
      int count = 0, maxCount = 0;
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); // Read each element of the sequence
        if(arr[i] == 0){
          count++;
        }else{
          count = 0;
        }
        maxCount = Math.max(maxCount, count);
      }
      System.out.println(maxCount);
  
    }
    sc.close();
  }
}
