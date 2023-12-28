/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.ArrayList;
import java.util.List;

public class OCP_Ex2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(31);
        nums.add(56);
        nums.add(17);
        nums.add(101);
        SortingProcessor.print(new SelectionSort(), nums);
        /* SortingProcessor.print(new MergeSort(), nums);
         * SortingProcessor.print(new InsertionSort(), nums); */
    }
}
