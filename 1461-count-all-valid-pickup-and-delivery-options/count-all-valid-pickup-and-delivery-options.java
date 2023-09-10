class Solution {
    public int countOrders(int n) {
        if(n==1) return 1;
        int space=(n-1)*2+1;
        int number=space*(space-1)/2+space;
        long ans=number*((long)countOrders(n-1))%1000000007;
        return (int)ans;
    }
}