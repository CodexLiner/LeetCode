class Solution {
    public static int minDeletions(String s) {
        Set<Integer> set = new HashSet<>();
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
           chars[c - 'a']++;
        }
        int count = 0;
        for(int i = 0; i < 26 ; i++ ){
            if(chars[i] > 0 && set.contains(chars[i])){
                while(chars[i] > 0 && set.contains(chars[i]) ){
                    chars[i]--;
                    count++;
                }
            } 
            set.add(chars[i]);
        }
        return count;
        

    




        // int count = 0;
        // Arrays.sort(chars);
        // int i = 0;
        // int j = 1;
        // do {
        //     if (chars[i] != 0 && chars[j] != 0 && chars[i] == chars[j]) {
        //         chars[j]--;
        //         count++;
        //         Arrays.sort(chars);
        //         i = 0;
        //         j = 1;
        //     } else {
        //         i++;
        //         j++;
        //     }
        // } while (j != 26);


        // return count;
    }

}