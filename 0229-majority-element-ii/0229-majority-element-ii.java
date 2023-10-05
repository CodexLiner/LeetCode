class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) ) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums) {
            if (map.get(num) > nums.length / 3) {
                // System.out.print(num);
                li.add(num);
            }
            //if(li.size()==2)break;

        }
        Set<Integer> set = new LinkedHashSet<>(li);

        // delete al elements of arraylist
        li.clear();

        // add element from set to arraylist
        li.addAll(set);
        return li;
    

        // int n = nums.length;
        // int candidate1 = 0, candidate2 = 0;
        // int count1 = 0, count2 = 0;

        // // Step 1: Find the two potential candidates
        // for (int num : nums) {
        //     if (num == candidate1) {
        //         count1++;
        //     } else if (num == candidate2) {
        //         count2++;
        //     } else if (count1 == 0) {
        //         candidate1 = num;
        //         count1 = 1;
        //     } else if (count2 == 0) {
        //         candidate2 = num;
        //         count2 = 1;
        //     } else {
        //         count1--;
        //         count2--;
        //     }
        // }

        // // Step 2: Count the occurrences of potential candidates
        // count1 = 0;
        // count2 = 0;
        // for (int num : nums) {
        //     if (num == candidate1) {
        //         count1++;
        //     } else if (num == candidate2) {
        //         count2++;
        //     }
        // }

        // // Step 3: Check if the candidates appear more than n/3 times
        // List<Integer> result = new ArrayList<>();
        // if (count1 > n / 3) {
        //     result.add(candidate1);
        // }
        // if (count2 > n / 3) {
        //     result.add(candidate2);
        // }

        // return result;
    }
}