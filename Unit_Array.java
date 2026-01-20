import java.util.*;

public class Unit_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); // Length of the line
    while (t-- > 0) {
      int n = sc.nextInt(); // Position of the grasshopper
      int[] arr = new int[n];
      int pos = 0, neg = 0;
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt(); // Read each element of the sequence
        if(arr[i]==1) pos++;
        else neg++;
      }
      int count=0;
      while(neg>pos){
        neg--;
        pos++;
        count++;
      }
      if(neg%2!=0){
        count++;
      }
      System.out.println(count);
    }
    sc.close();
  }
}
