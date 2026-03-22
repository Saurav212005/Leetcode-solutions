class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] c = new int[26];
        for(char ch:s.toCharArray()) c[ch-'a']++;
        for(char ch:t.toCharArray()) c[ch-'a']--;
        for(int x:c) if(x!=0) return false;
        return true;
    }
}