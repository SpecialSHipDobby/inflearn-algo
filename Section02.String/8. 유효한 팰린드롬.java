import java.util.*;
import java.io.*;
  
public class Main {
  public static void main(String[] args) throws IOException {
	// string 입력 받은 후, .replaceAll("[^a-zA-Z]", "")로 변경, 그 후 투 포인터로 확인.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String basic = br.readLine();
    String fixed = basic.replaceAll("[^a-zA-Z]", "").toLowerCase();
    // System.out.println(fixed);
    
    int start = 0;
    int end = fixed.length() - 1 ;
    for(int i = 0; i < fixed.length() / 2; i++) {
      char startChar = fixed.charAt(i);
      char endChar = fixed.charAt(end);
      if(startChar == endChar) {
        start++;
        end--;
        // System.out.println(startChar + " " + endChar);
      } else {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
    return ;
  }
}
