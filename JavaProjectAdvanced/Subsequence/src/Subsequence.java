
public class Subsequence {

    public String findSubsequence(String word1, String word2) {

        String shortestWord;
        String longestWord;

        int length1 = word1.length();
        int length2 = word2.length();

        if(length1 < length2) {
            shortestWord = word1;
            longestWord = word2;
        } else if(length1 > length2) {
            shortestWord = word2;
            longestWord = word1;
        } else {
            shortestWord = word1;
            longestWord = word2;
        }


        if(longestWord.contains(shortestWord)) {
            return(word1);
        } else {

            char[] chars = shortestWord.toCharArray();

            for(int i=1; i<chars.length; i++) {

                String modifiedShortest = shortestWord.substring(i);
                String modifiedShortestVer2 = shortestWord.substring(0,chars.length-i);
                String modifiedShortestVer3 = shortestWord.substring(i,chars.length-i);

                if(longestWord.contains(modifiedShortest)) {

                    return modifiedShortest;

                } else if(longestWord.contains(modifiedShortestVer2)) {

                    return modifiedShortestVer2;

                } else if(longestWord.contains(modifiedShortestVer3)) {

                    return modifiedShortestVer3;

                }

            }

        }

        return null;
    }


    public static void main(String[] args) {

        long start = System.nanoTime();

        Subsequence sq = new Subsequence();

        System.out.println(sq.findSubsequence("Word", "Words"));

        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - start;
        long sec = 1000;
        System.out.println(elapsedTime/sec + " milli seconds.");

    }



}
