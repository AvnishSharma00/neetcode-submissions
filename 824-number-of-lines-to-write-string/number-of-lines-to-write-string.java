class Solution {
    public int[] numberOfLines(int[] widths, String s) {
           int count=1;
           int widCount=0;
          
           for(int i=0;i<s.length();i++){
              if(widCount+widths[s.charAt(i)-97]>100){
                  count++;
                  widCount=0;
               }
               widCount+=widths[s.charAt(i)-97];
           }
           return new int[]{count,widCount};
    } 
}