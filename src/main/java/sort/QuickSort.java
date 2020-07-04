package sort;

import compare.Comparator;
import data.Students;

public class QuickSort<T> extends Swapper<T> implements Sortable<T>{

    @Override
    public void sort(Students[] students, Comparator<T> comparator) {
        quicksort(students, 0, students.length-1, comparator);
    }

    private void quicksort(Students[] students, int low, int high, Comparator<T> comparator) {
        if(low<high){
            int pi = partition(students, low, high, comparator);

            quicksort(students, low, pi-1, comparator);
            quicksort(students,pi+1, high, comparator);
        }
    }

    private int partition(Students[] students, int low, int high, Comparator<T> comparator) {
        Students pivot = students[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (comparator.compare(students[j], pivot) <0)
            {
                i++;

                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Students temp = students[i+1];
        students[i+1] = students[high];
        students[high] = temp;

        return i+1;
    }


}
