import java.util.Random;
import java.util.Arrays;
public class ArrayConstructor{
    Random rand = new Random();
    //int arr[];
    public ArrayConstructor(){ //args er argumentet fra kommandovinduet
    }

    public int[] getRandArray(int size, int maxRange){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(maxRange);
        }
        return arr;
    }

    public int[] getUniqueArray(int size, int maxRange){ //maxRange er upper-limit på int-verdi
        int[] arr = new int[size];
        boolean[] boolArr = new boolean[maxRange]; //
        for (int i = 0; i < arr.length; i++){
            int random = rand.nextInt(maxRange);
            while (boolArr[random] == true){ //hvis tallet allerede er i arrayen
                random = rand.nextInt(maxRange);
            }
            boolArr[random] = true;
            arr[i] = random;
        }

        return arr;
    }


    public int[] getIncreasingArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = i;
        }
        return arr;
    }
    public int[] getDecreasingArray(int size){
        int[] arr = new int[size];
        int tall = 0;
        for (int i = size-1; i >= 0; i--){
            arr[i] = tall;
            tall++;
        }
        return arr;
    }

}
