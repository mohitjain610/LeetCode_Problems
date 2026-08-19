class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount==0)return 100;
        int a=purchaseAmount%10;
        if(a<=4){
            return (100-((purchaseAmount/10)*10));
        }else{
            return (90-((purchaseAmount/10)*10));
        }
    }
}