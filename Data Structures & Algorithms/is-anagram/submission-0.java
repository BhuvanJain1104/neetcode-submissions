class Solution {
    public static boolean isAnagram(String s, String t) {
        int[] counts = new int[256];
        int[] counts2 = new int[256];

        for (char ch : s.toCharArray()) {
            counts[ch]++;
        }
        for (char ch : t.toCharArray()) {
            counts2[ch]++;
        }

        return Arrays.equals(counts,counts2);
    }
}
