//PROBLEM NO. 3

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int maxLength = 0;
        int i = 0 ,j = 0;
        while (j<s.length()) {
            char curr = s.charAt(j);
            if (!set.contains(curr)) {
                set.add(curr);
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}
