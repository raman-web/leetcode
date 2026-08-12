import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt = new ArrayList<>(numRows);
        for (int row = 1; row <= numRows; row++) {
            List<Integer> elements = new ArrayList<>(numRows);
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row) {
                    elements.add(1);
                } else {
                    elements.add(pt.get(row - 2).get(col - 1) + pt.get(row - 2).get(col - 2));
                }
            }
            pt.add(elements);
        }
        return pt;
    }
}