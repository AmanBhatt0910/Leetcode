class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if(map.size() > 0 && isEqual(map, s.charAt(i))) {
                    longest = Math.max(longest, (j-i+1));
                }
            }
            map.clear();
        }

        return longest;
    }

    private static boolean isEqual(Map<Character, Integer> map, char ch) {
        int val = map.get(ch);

        for(char key : map.keySet()) {
            if(map.get(key) != val) {
                return false;
            }
        }

        return true;
    }
}