/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.Collections;
import java.util.List;

public class MergeSort implements Sorting{
    @Override
    public void showedTheResult(List<Integer> setInput) {
        Collections.sort(setInput);
        for (int i = 0; i < setInput.size(); i++) {
            System.out.print(setInput.get(i) + " ");
        }
    }
}
