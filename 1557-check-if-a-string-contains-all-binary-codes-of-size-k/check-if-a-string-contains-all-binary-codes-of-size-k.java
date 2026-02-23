class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        Set<String> binaryCodes = new HashSet<>();

        for(int i = k; i <= n; i++) {
            String code = s.substring(i-k, i);
            binaryCodes.add(code);

            if(binaryCodes.size() == Math.pow(2, k)) {
                return true;
            }
        }

        return false;
    }
}