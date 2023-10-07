package Pb_77_Combinations;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> sols = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        back (sols, sol, n, k);
        return sols;
    }
    public void back(List<List<Integer>> sols, List<Integer> sol, int n, int k) {
        if (sol.size() == k){
            List<Integer> copy = new ArrayList<>(sol);
            sols.add(copy);
            return;
        }
        int start = 1;
        if (sol.size() > 0){
            start = sol.get(sol.size() -1) + 1;
        }
        for (int i = start; i <= n; i++){
            sol.add(i);
            back(sols, sol, n, k);
            sol.remove(sol.size() - 1);
        }
    }
}