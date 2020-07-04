package main;

public class HashInvoker {

    private static final String sMsgRemoveKey = "Remove key '%d' from the hash table.";
    private static final String sMsgSearchForKey = "Search for key '%d' in the hash table.";
    private static final String sMsgSearchKeyFound = "Found key '%d' in hash table.";
    private static final String sMsgIndexIsOutOfBounds = "This position is out of bounds";
    private static final String sMsgNoElement = "There is no element";
    private static final String sMsgGetKeyFound = "Key %d in the hash table";

    static public void insert(ADSHashTable table, int key) {
        try {
            table.insert(key);
            print(table.toString());
        } catch (Exception e) {
            flush(e);
        }
    }

    static public void search(ADSHashTable table, int key) {
        try {
            print(String.format(sMsgSearchForKey, key));
            print(String.format(sMsgSearchKeyFound, table.search(key)));
        } catch (Exception e) {
            flush(e);
        }
    }

    static public void remove(ADSHashTable table, int key) {
        try {
            print(String.format(sMsgRemoveKey, key));
            table.remove(key);
            print(table.toString());
        } catch (Exception e) {
            flush(e);
        }
    }

    static public void print(String text) {
        System.out.println(text);
        System.out.flush();
    }

    static private void flush(Exception e) {
        System.out.flush();
        System.err.println(e.getMessage());
        System.err.flush();
    }

    public static void clear(ADSHashTable table){
        table.clear();
    }

    public static void getNum(ADSHashTable table, int index){
        HashArray array = table.getHashArray();
        if (index > array.getSize() || index < 0) {
            print(sMsgIndexIsOutOfBounds);
        } else if (array.isFree(index) || array.asDeleted(index)) {
            print(sMsgNoElement);
        } else
            print(String.format(sMsgGetKeyFound, array.get(index-1)));
    }

    }

