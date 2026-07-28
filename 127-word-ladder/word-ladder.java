class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        HashSet<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int length = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int k = 0; k < size; k++) {

                String word = queue.poll();

                if (word.equals(endWord)) {
                    return length;
                }

                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {

                    char original = arr[i];

                    for (char c = 'a'; c <= 'z'; c++) {

                        if (c == original)
                            continue;

                        arr[i] = c;
                        String newWord = new String(arr);

                        if (set.contains(newWord)) {
                            queue.offer(newWord);
                            set.remove(newWord);   // Mark as visited
                        }
                    }

                    arr[i] = original;
                }
            }

            length++;
        }

        return 0;
    }
}