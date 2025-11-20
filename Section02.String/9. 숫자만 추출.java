import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String sentence = br.readLine().replaceAll("[^0-9]", "");

      int oh = Integer.parseInt(sentence);

      System.out.println(oh);
  }
}
