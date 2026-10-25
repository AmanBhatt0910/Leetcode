class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size1 = word1.length(), size2 = word2.length();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while(i < size1 || i < size2) {
            if(i < size1)
                result.append(word1.charAt(i));
            if(i < size2) 
                result.append(word2.charAt(i));
            i++;
        }

        return result.toString();
    }
}