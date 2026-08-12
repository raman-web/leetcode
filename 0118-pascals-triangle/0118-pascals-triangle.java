class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
        List<Integer> elements = new ArrayList<>();
        for (int col = 1; col <= row; col++) {
            if(col==1 || col == row ) {
                elements.add(1);
            }
            else {
                List<Integer> previousRow = pt.get(row-2);
                elements.add(previousRow.get(col-1) + previousRow.get(col-2));
            }
        }
        pt.add(elements);
    }
        return pt;
    }
}