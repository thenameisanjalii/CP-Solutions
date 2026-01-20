import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0){
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      int flag = 0; // Flag to check if k is present in the array
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        if(arr[i] == k){
          flag=1;
        }
      }
      if(flag == 0){
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }
    sc.close();
  }
}
