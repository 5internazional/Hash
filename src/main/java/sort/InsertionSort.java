package sort;

import compare.Comparator;
import data.Students;

public class InsertionSort<T> extends Swapper<T> implements Sortable {
    @Override
    public void sort(Students[] students, Comparator comparator) {
        Students temp;
        for (int i = 1; i < students.length; i++) {
            temp = students[i];
            int j = i;
            while ( j > 0 && comparator.compare(students[j-1], temp) > 0) {
                students[j] = students[j-1];
                j--;
            }
            students[j] = temp;
        }


    }
}
