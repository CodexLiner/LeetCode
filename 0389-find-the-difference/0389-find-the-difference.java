class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) - 1);
            if (hashMap.get(c) <= 0) hashMap.remove(c);

        }

        System.out.println(hashMap);
        return hashMap.keySet().stream().toList().get(0);    
    }
}