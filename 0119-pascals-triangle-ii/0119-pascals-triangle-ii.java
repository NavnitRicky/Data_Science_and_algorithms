class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();
        int n = rowIndex;

        long a = 1;

        for (int j = 0; j <= n; j++) {
            ans.add((int)a);
            a = a * (n - j) / (j + 1);
        }

        return ans;
    }
}