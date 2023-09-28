class Solution {
   
    public int countPrimes(int n) {
        if (n<3) return 0;
        int[] primes = new int[n];;
        int count=0;

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