class Solution {
    public int digit(int n){
           int sum=0;
           while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n=n/10;
           }
           return sum;
    }
    public boolean isHappy(int n) {
           int slow=n;
           int fast=n;
           do{
             slow=digit(slow);
             fast=digit(digit(fast));
           } while(slow!=fast);
            return (slow==1)?true:false;
    }
}
