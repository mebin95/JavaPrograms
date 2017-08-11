import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    ArrayList<String> listOfWords;

    public void storeWords(String FILENAME) {

        listOfWords = new ArrayList<String>();

            try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

                String line;

                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\n");

                    listOfWords.add(parts[0]);

                }

                //System.out.println(listOfWords);

            } catch (IOException e) {

                e.printStackTrace();

            }

        }


    public String sortWord(String word) {

        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        return sorted;

    }

    public void sortAndStore() {

        HashMap<String, ArrayList<String>> anagramList = new HashMap<>();

        for(int i=0; i<listOfWords.size(); i++) {

            ArrayList<String> wordList = anagramList.get(sortWord(listOfWords.get(i)));

            if(wordList == null) {

                wordList = new ArrayList<String>();
                wordList.add(listOfWords.get(i));
                anagramList.put(sortWord(listOfWords.get(i)), wordList);

            } else if(anagramList.containsKey(sortWord(listOfWords.get(i)))){

                wordList.add(listOfWords.get(i));
                anagramList.put(sortWord(listOfWords.get(i)), wordList);

            }


        }

        int valueSize = 1;
        int previousKeySize = 1;
        ArrayList<String> keys = new ArrayList<String>();
        for(String s : anagramList.keySet()) {

            if(valueSize < anagramList.get(s).size()) {
                valueSize = anagramList.get(s).size();
                previousKeySize = s.length();
                keys.clear();
                keys.add(s);

            } else if(valueSize == anagramList.get(s).size()) {
                if(previousKeySize < s.length()) {
                    keys.clear();
                    keys.add(s);

                }
                else if(previousKeySize == s.length()) {
                    keys.add(s);
                }
            }

        }

        System.out.println("Key with most anagrams: " + keys);

    }



    public static void main(String[] args) {

        long start = System.nanoTime();

        String FILENAME = "C:/Users/Administrator/Desktop/JavaProjectAdvanced/Anagrams/wordList.txt";

        Anagram a = new Anagram();

        a.storeWords(FILENAME);

        a.sortAndStore();

        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - start;
        long sec = 1000000000;
        System.out.println(elapsedTime/sec + " seconds.");

    }




}
