class Solution {
    public boolean winnerOfGame(String color) {
        char c[] = color.toCharArray();
        int a = 0;
        int b = 0;
        for(int i = 1 ; i < c.length - 1; i++){
            if(c[i-1]=='A' && c[i+1]=='A' && c[i] =='A')a++;
            if(c[i-1]=='B' && c[i+1]=='B' && c[i] =='B')b++;
        }
        return a > b;
    }
}