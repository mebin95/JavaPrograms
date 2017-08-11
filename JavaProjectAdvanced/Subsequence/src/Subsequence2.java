
//Not Finished

public class Subsequence2 {

    public void shortestSubsequence(String word1, String word2) {

        String shortestWord;
        String longestWord;



        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 < length2) {
            shortestWord = word1.toLowerCase();
            longestWord = word2.toLowerCase();
        } else if(length1 > length2) {
            shortestWord = word2.toLowerCase();
            longestWord = word1.toLowerCase();
        } else {
            shortestWord = word1.toLowerCase();
            longestWord = word2.toLowerCase();
        }

        String OriginalLongest = longestWord;

        if(longestWord.contains(shortestWord)) {

            char[] chars = shortestWord.toCharArray();

            for(int i=0; i<chars.length; i++) {

                longestWord = longestWord.replace(shortestWord.charAt(i) + "", "");

                System.out.println(longestWord);

            }

            System.out.println(shortestWord + " needs to insert " + longestWord.length() + " characters to make it equal to " + OriginalLongest);

        } else {

            char[] chars = shortestWord.toCharArray();

            for(int i=0; i<chars.length; i++) {

                longestWord = longestWord.replace(shortestWord.charAt(i) + "", "");

                System.out.println(longestWord);

            }

            System.out.println(shortestWord + " needs to insert " + longestWord.length() + 1 + " characters to make it equal to " + OriginalLongest);

        }

    }


    public static void main(String[] args) {

        long start = System.nanoTime();

        Subsequence2 sq = new Subsequence2();

        sq.shortestSubsequence("word", "words");

        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - start;
        long sec = 1000;
        System.out.println(elapsedTime/sec + " milli seconds.");

    }

}
