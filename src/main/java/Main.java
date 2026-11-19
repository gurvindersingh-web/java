public class Main {
    public static void main(String[] args) {
        Integer a[] = { 12, 3, 4, 67, 34, 67, 78 };
        Double b[] = { 12.3, 3.4, 4.5, 67.8, 34.9, 67.1, 78.2 };
        String s[] = { "Hello", "World", "Java", "Programming", "Language" };
        System.out.println("Sorted Integer Array: ");
        bubbleSort(a);
        printArray(a);
        System.out.println("Sorted double Array");
        bubbleSort(b);
        printArray(b);
        System.out.println("Sorted String Array");
        bubbleSort(s);
        printArray(s);
    }

    static <T extends Comparable<T>> void bubbleSort(T a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0)
                    swap(j, j + 1, a);
            }
        }
    }

    static <T> void swap(int i, int j, T a[]) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static <T> void printArray(T a[]) {
        for (T e : a)
            System.out.print(e + " ");
    }
}