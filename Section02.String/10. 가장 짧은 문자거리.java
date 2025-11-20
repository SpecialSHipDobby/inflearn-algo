import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      String sentence = st.nextToken();
      char[] sentenceToChar = sentence.toCharArray();
      String letter = st.nextToken();
      char toChar = letter.charAt(0);
      int[] num = new int[sentenceToChar.length];
      char word;
      
      int add = 1000;
      for(int i = 0; i < sentence.length(); i++) {
        word = sentenceToChar[i];
        if (word == toChar) {
          num[i] = 0;
          add = 0;
        } else {
          num[i] = ++add;
        }
      }
      
      int add2 = 1000;
      for(int i = sentence.length() - 1; i >= 0; i--) {
        word = sentenceToChar[i];
        if(word == toChar) {
          num[i] = 0;
          add2 = 0;
        } else {
          int smaller = Math.min(num[i], ++add2);
          num[i] = smaller;
        }
      }
      
      for(int i = 0; i < sentence.length(); i++) {
        System.out.print(num[i] + " ");
      }
  }
}
