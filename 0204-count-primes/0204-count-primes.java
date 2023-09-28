class Solution {
    private int count;
    private int[] primes;
    
    public int countPrimes(int n) {
        if (n<3) return 0;
        primes=new int[n];
        count=0;

        primes[0]=1;
        primes[1]=1;

        for (int i=2;i<n;i++) {
            if (primes[i]==0) {
                count++;
                for (int j=i+i; j<n; j+=i) {
                    primes[j]=1;
                }
            }
        }
        return count;
    }
}