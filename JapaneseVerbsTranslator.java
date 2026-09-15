import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        String japanese = translateToJapanese("work","verbs.txt");
        System.out.println(japanese);
        japanese = translateToJapanese("work","talk","verbs.txt");
        System.out.println(japanese);
    }

    public static String translateToJapanese(String englishVerb, String filename)
      throws FileNotFoundException, IOException{
        FileInputStream file = new FileInputStream(filename);
        Scanner kb = new Scanner(file);
        while (kb.hasNextLine()){
          String line = kb.nextLine();
          String[] parts = line.split("=");
          if (parts[0].equals(englishVerb)){
            kb.close();
            return parts[1];
          }
        }
        kb.close();
      return null;
      }


    public static String translateToJapanese (String englishVerb1, 
          String englishVerb2, String filename)
          throws FileNotFoundException, IOException {
            String word1 = translateToJapanese(englishVerb1,filename);
            String word2 = translateToJapanese(englishVerb2,filename);
            if (word1.endsWith("masu")){
              word1 = word1.substring(0,word1.length()-4)+"nagara";
            }
        return word1 + word2;
    }
}
