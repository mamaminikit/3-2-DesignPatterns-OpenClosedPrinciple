import java.util.Collections;
import java.util.List;

public class InsertionSort implements Sorting{
    @Override
    public void showedTheResult(List<Integer> setInput) {
        Collections.sort(setInput);
        for (int i = 0; i < setInput.size(); i++) {
            System.out.print(setInput.get(i) + " ");
        }
    }
}
