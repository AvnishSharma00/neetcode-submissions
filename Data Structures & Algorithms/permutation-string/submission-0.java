class Solution {
    public boolean checkInclusion(String s1, String s2) {
           char ch[]=s1.toCharArray();
           Arrays.sort(ch);
           String str1=new String(ch);
           for(int i=0;i<s2.length();i++){
              for(int j=i;j<s2.length();j++){
                  char ch1[]=s2.substring(i,j+1).toCharArray();
                  Arrays.sort(ch1);
                  String str2=new String(ch1);
                  if(str1.equals(str2)){
                    return true;
                  }
              }
           }
           return false;
    }
}
