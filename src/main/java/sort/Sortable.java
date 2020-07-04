package sort;

import compare.Comparator;
import data.Students;

public interface Sortable<T> {
    public void sort(Students [] students, Comparator<T> comparator);
}