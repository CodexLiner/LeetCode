class Solution {
    public int reachNumber(int target) {
        int moves = 0;
        int total = 0;
        if(target < 0)target = -target;
        target = target;
        while(total < target || (total-target) % 2 != 0){
            moves++;
            total += moves; 
        }
        return moves;
    }
}