class Solution {
    public String makeLargestSpecial(String s) {
        List<String> special = new ArrayList<>();
        int count = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == '1' ? 1 : -1;

            if(count == 0) {
                String inner = s.substring(start + 1, i);

                String processed = "1" + makeLargestSpecial(inner) + "0";
                special.add(processed);

                start = i + 1;
            }
        }

        Collections.sort(special, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for(String str : special) {
            result.append(str);
        }

        return result.toString();
    }
}