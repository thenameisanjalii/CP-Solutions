import java.util.Scanner;

public class B_Make_AP {
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  long t=sc.nextLong();
  while(t-->0){
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();

    boolean ans=false;
    long new_a=2*b-c;
    if(new_a/a>0 && new_a%a==0){
      ans=true;
    }

    long new_b = (a+c)/2;
    if(new_b/b>0 && new_b%b==0 && (c-a)%2==0){
      ans=true;
    }

    long new_c=2*b-a;
    if(new_c/c>0 && new_c%c==0){
      ans=true;
    }

    if(ans){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
  sc.close();
  }
}
