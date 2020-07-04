package sort;


import data.Students;

public class Swapper<T> {

    protected void swap(Students[] students, int i, int j) {
        Students memorizedObject = students[i];
        students[i] = students[j];
        students[j] = memorizedObject;
    }
}