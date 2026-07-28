class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
           HashSet<String> set=new HashSet<>(wordList);
           if(!set.contains(endWord)){
             return 0;
           }
           Queue<String> queue=new LinkedList<>();
           queue.offer(beginWord);
           int length=1;
           while(!queue.isEmpty()){
                int size=queue.size();
                for(int i=0;i<size;i++){
                    String current=queue.poll();
                    if(current.equals(endWord)){
                        return length;
                    }
                
                char arr[]=current.toCharArray();
                for(int k=0;k<arr.length;k++){
                    char original=arr[k];
                    for(char c='a';c<='z';c++){
                        if(c==original){
                          continue;
                        }
                        arr[k]=c;
                        String newWord=new String(arr);
                        if(set.contains(newWord)){
                           queue.offer(newWord);
                           set.remove(newWord);
                        }
                    }
                    arr[k]=original;

                }
                }
               length++; 
           }
           return 0;
    }
}
