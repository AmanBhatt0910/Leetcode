class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int longest = 0;

        for(int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for(int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                if(isEqual(freq)) {
                    longest = Math.max(longest, (j-i+1));
                }
            }
        }

        return longest;
    }
    private static boolean isEqual(int[] freq) {
        int target = 0;

        for(int item : freq) {
            if(item == 0) continue;
            else if(target == 0) target = item;
            else if(item != target) return false;
        }

        return true;
    }
}