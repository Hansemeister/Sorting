import java.util.Random;
import java.util.Arrays;

public class Test {
    //args[] som stoerrelse på mengden tilfeldige tall
    public static void main(String[] args){
        int arr[];
        double tid;
        //ArrayConstructor generator = new ArrayConstructor();
        Sortering sorteringsMann = new Sortering();

        /*
        testSelectionSort(sorteringsMann, 10);
        testQuickSort(sorteringsMann, 10);
        testHeapSort(sorteringsMann, 10);
        */

        /* JavaSort
        System.out.println("\nWARMUP");
        testSelectionSort(sorteringsMann, 1000);
        System.out.println("\n FULL TEST \n");
        testJavaSort(sorteringsMann, 1000);
        testJavaSort(sorteringsMann, 5000);
        testJavaSort(sorteringsMann, 10000);
        testJavaSort(sorteringsMann, 50000);
        testJavaSort(sorteringsMann, 100000);
        testJavaSort(sorteringsMann, 1000000); //1 million
        testJavaSort(sorteringsMann, 100000000); //100 millioner
        */

        /* SelectionSort
        System.out.println("\nWARMUP");
        testSelectionSort(sorteringsMann, 1000);
        System.out.println("\n FULL TEST \n");
        testSelectionSort(sorteringsMann, 1000);
        testSelectionSort(sorteringsMann, 5000);
        testSelectionSort(sorteringsMann, 10000);
        testSelectionSort(sorteringsMann, 50000);
        testSelectionSort(sorteringsMann, 100000);
        testSelectionSort(sorteringsMann, 1000000); //1 million
        testSelectionSort(sorteringsMann, 100000000); //100 millioner
        */

        /* HeapSort
        System.out.println("\nWARMUP");
        System.out.println("\n FULL TEST \n");
        testHeapSort(sorteringsMann, 1000);
        testHeapSort(sorteringsMann, 1000);
        testHeapSort(sorteringsMann, 5000);
        testHeapSort(sorteringsMann, 10000);
        testHeapSort(sorteringsMann, 50000);
        testHeapSort(sorteringsMann, 100000);
        testHeapSort(sorteringsMann, 1000000);
        testHeapSort(sorteringsMann, 100000000);
        */

        /* QuickSort
        System.out.println("\nWARMUP");
        testQuickSort(sorteringsMann, 1000);
        System.out.println("\n FULL TEST \n");
        testQuickSort(sorteringsMann, 1000);
        testQuickSort(sorteringsMann, 5000);
        testQuickSort(sorteringsMann, 10000);
        testQuickSort(sorteringsMann, 50000);
        testQuickSort(sorteringsMann, 100000);
        testQuickSort(sorteringsMann, 1000000);
        testQuickSort(sorteringsMann, 100000000);
        */

    }//end main

    public static boolean erStigende(int[] testet){
        for (int i = 0; i < testet.length; i++){

        }
        return true;
    }

    public static void testJavaSort(Sortering sorter, int stoerrelse){
        ArrayConstructor generator = new ArrayConstructor();
        int[] arr;
        double tid;
        long t;
        System.out.println("\n----JAVA SORT FOR " + stoerrelse + "----");

        arr = generator.getRandArray(stoerrelse, stoerrelse);
        t = System.nanoTime();
        Arrays.sort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Tilfeldig sortert kjoretid: " + tid);

        arr = generator.getIncreasingArray(stoerrelse);
        t = System.nanoTime();
        Arrays.sort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Stigende sortert kjoretid: " + tid);

        arr = generator.getDecreasingArray(stoerrelse);
        t = System.nanoTime();
        Arrays.sort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Synkende sortert kjoretid: " + tid);
    }

    public static void testSelectionSort(Sortering sorter, int stoerrelse){
        ArrayConstructor generator = new ArrayConstructor();
        int[] arr;
        double tid;
        long t;
        System.out.println("\n----SELECTION SORT FOR " + stoerrelse + "----");

        arr = generator.getRandArray(stoerrelse, stoerrelse);
        t = System.nanoTime();
        sorter.selectionSort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Tilfeldig sortert kjoretid: " + tid);

        arr = generator.getIncreasingArray(stoerrelse);
        t = System.nanoTime();
        sorter.selectionSort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Stigende sortert kjoretid: " + tid);

        arr = generator.getDecreasingArray(stoerrelse);
        t = System.nanoTime();
        sorter.selectionSort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Synkende sortert kjoretid: " + tid);

    }

    public static void testHeapSort(Sortering sorter, int stoerrelse){
        ArrayConstructor generator = new ArrayConstructor();
        int[] arr;
        double tid;
        long t;
        System.out.println("\n----HEAP-SORT FOR " + stoerrelse + "----");

        arr = generator.getRandArray(stoerrelse, stoerrelse);
        t = System.nanoTime();
        sorter.heapSort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Tilfeldig sortert kjoretid: " + tid);

        arr = generator.getIncreasingArray(stoerrelse);
        t = System.nanoTime();
        sorter.heapSort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Stigende sortert kjoretid: " + tid);

        arr = generator.getDecreasingArray(stoerrelse);
        t = System.nanoTime();
        sorter.heapSort(arr);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Synkende sortert kjoretid: " + tid);

    }

    public static void testQuickSort(Sortering sorter, int stoerrelse){
        ArrayConstructor generator = new ArrayConstructor();
        int[] arr;
        double tid;
        long t;
        System.out.println("\n----QUICK-SORT FOR " + stoerrelse + "----");

        arr = generator.getRandArray(stoerrelse, stoerrelse);
        t = System.nanoTime();
        sorter.quickSort(arr, 0, arr.length-1);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Tilfeldig sortert kjoretid: " + tid);

        arr = generator.getIncreasingArray(stoerrelse);
        t = System.nanoTime();
        sorter.quickSort(arr, 0, arr.length-1);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Stigende sortert kjoretid: " + tid);

        arr = generator.getDecreasingArray(stoerrelse);
        t = System.nanoTime();
        sorter.quickSort(arr, 0, arr.length-1);
        tid = ( System.nanoTime() - t ) / 1000000.0;
        System.out.println("Synkende sortert kjoretid: " + tid);
    }

}//end
