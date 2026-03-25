
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        int[] ind = new int[numCourses];
        for (int[] p : prerequisites) {
            int a = p[0];
            int b = p[1];
            adj.get(b).add(a);
            ind[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        int[] res = new int[numCourses];
        int idx = 0;

        while (!q.isEmpty()) {
            int vertex = q.poll();
            res[idx++] = vertex;

            for (int nei : adj.get(vertex)) {
                ind[nei]--;
                if (ind[nei] == 0) {
                    q.add(nei);
                }
            }
        }
        if (idx == numCourses) {
            return res; 
        }
        else{
        return new int[0];}
    }
}