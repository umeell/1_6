import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int y = 300;
    for(int i = 0;i<=y;i++){  
      int f = (9/5)*i + 32;
      System.out.println(i+" "+f);
      }
  }
}