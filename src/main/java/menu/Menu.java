package menu;

import compare.Comparator;
import compare.MNComparator;
import data.Students;
import hash.Hash;
import main.ADSHashTable;
import main.HashInvoker;
import probing.IProbing;
import probing.QuadraticProbing;
import sort.*;

import java.util.Scanner;

public class Menu {
    private int size = 10;
    private static Scanner scan = new Scanner(System.in);
    private static Console console = new Console();
    private IProbing doubPr = new QuadraticProbing();
    private ADSHashTable table;
    private Hash newHash = new Hash(size);


    public void menuView() {
        System.out.println("1. Add number to hash table.");
        System.out.println("2. Get number from hash table.");
        System.out.println("3. Search number in hash table.");
        System.out.println("4. Delete number from hash table.");
        System.out.println("5. Clear hash table.");
        System.out.println("6. Sort students by matriculation number.");
        System.out.println("0. Exit");
    }

    public void menu() {
        menuView();
        table = new ADSHashTable(size, newHash, doubPr);
        int answer = 1;
        while (answer != 0) {
            answer = scan.nextInt();
            switch (answer) {
                case 1:
                    HashInvoker.insert(table, console.readInt("Enter a number in hash table"));
                    break;
                case 2:
                    HashInvoker.getNum(table, console.readInt("Enter an index to get a number from hash"));
                    break;
                case 3:
                    HashInvoker.search(table, console.readInt("Enter a number you are searching for"));
                    break;
                case 4:
                    HashInvoker.remove(table, console.readInt("Enter a number you would like to remove"));
                    break;
                case 5:
                    HashInvoker.clear(table);
                    System.out.println("Table is empty");
                    break;
                case 6:
                    sorting();
                    break;
                case 0:
                    break;
            }
        }
    }

    private void sorting() {
        Sortable <Students> sorting = null;
        int sort = console.readInt("Which sorting do you want to use? " +
                "Bubblesort (enter 1)," +
                "Selectionsort (enter 2) " +
                "Insertionsort (enter 3)" +
                "Quicksort (enter 4)");
                if (sort == 1) {
                    sorting = new BubbleSort<>();
                } else if (sort == 2) {
                    sorting = new SelectionSort<>();
                }else if(sort == 3) {
                    sorting = new InsertionSort<>();
                }else if(sort==4){
                    sorting = new QuickSort<>();
                } else {
                    System.out.println("Wrong input");
                    return;
                }
        sortAndPrint(setOfStudent(), sorting, new MNComparator());

    }

    private Students[] setOfStudent(){
        Students [] set = new Students[3];
        set[0] = new Students("Johnes", 13452);
        set[1] = new Students("Hobbes", 126435);
        set[2]  = new Students("York", 12341);
        return set;
    }

    private static void sortAndPrint(Students [] students, Sortable<Students> sort, Comparator <Students> comparator){
        comparator = new MNComparator();
        System.out.println("Sort algorithm: " + sort.getClass().getSimpleName() + " " +
                "MNComparator");
        sort.sort(students, comparator);
        for(int i = 0; i < students.length; i++){
            System.out.println((i + 1) + " " + students[i]);
        }

    }
}