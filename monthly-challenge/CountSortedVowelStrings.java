/*
P(n, k) = P(n-1, k) + k* P(n-1, k-1)   

static int permutationCoeff(int n, int k) { 
    int P[][] = new int[n + 2][k + 2]; 

    // Calculate value of Permutation  
    // Coefficient in bottom up manner 
    for (int i = 0; i <= n; i++) 
    { 
        for (int j = 0;  
             j <= Math.min(i, k);  
             j++) 
        { 
            // Base Cases 
            if (j == 0) 
                P[i][j] = 1; 

            // Calculate value using previosly  
            // stored values 
            else
                P[i][j] = P[i - 1][j] +  
                           (j * P[i - 1][j - 1]); 

            // This step is important  
            // as P(i,j)=0 for j>i 
            P[i][j + 1] = 0; 
        } 
    } 
    return P[n][k]; 
} 


C(n, k) = C(n-1, k-1) + C(n-1, k)
 C(n, 0) = C(n, n) = 1 //without repition
 
 
 The easiest way to calculate the number of combinations with repetitions is to use the folowing formula:
C(n,k) = (n+k-1)!/(n-1)!k!

If we apply this formula to our problem where we choose n from 5 (k = n, n = 5), it can be then simplified to this:
image
*/

/*
*Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

*/

class Solution {
     static int binomialCoeff(int n){
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }
    public int countVowelStrings(int n) {
        return binomialCoeff(n);
    }
}
