class Solution {
    public void duplicateZeros(int[] arr) {
           int res[]=new int[arr.length];
           int i=0;
           int k=0;
           while(i<res.length){
                 res[i]=arr[k];
                 if(arr[k]==0 &&i<res.length-1){
                    res[++i]=arr[k];
                 }
                 i++;
                 k++;
           }
         //  System.out.println(Arrays.toString(arr));
           for(int j=0;j<arr.length;j++){
               arr[j]=res[j];
           }

    }
}