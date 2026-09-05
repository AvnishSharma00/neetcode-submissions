import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Create graph
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Indegree of every course
        int[] indegree = new int[numCourses];

        // Build graph and calculate indegree
        for (int[] p : prerequisites) {

            int course = p[0];
            int prerequisite = p[1];

            graph.get(prerequisite).add(course);

            indegree[course]++;
        }

        // Courses with no prerequisites
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        // Topological sort
        int count = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            count++;

            for (int next : graph.get(current)) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        // If all courses were processed, no cycle exists
        return count == numCourses;
    }
}