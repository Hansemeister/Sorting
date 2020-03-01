import java.util.Arrays;
public class Sortering {

    public Sortering(){
    }

    //https://www.youtube.com/watch?v=ZHVk2blR45Q
    //Velger et pivot element og alt som er mindre enn pivotelementet går til venstre, større går til høyre for pivotel,

    public void quickSort(int[] arr, int start, int slutt){
        if (start >= slutt){
            return;
        }
        int pivot = arr[slutt];
        int teller = start; //indeks paa element stoerre enn pivot

        for (int i = start; i < slutt; i++){
            if (arr[i] <= pivot){
                swap(arr, teller, i);
                teller++;
                //System.out.println("byttet: " + Arrays.toString(arr));
            }
        }
        //System.out.println(Arrays.toString(arr));
        swap(arr, teller, slutt);
        quickSort(arr, start, teller-1);//venstre for pivot
        quickSort(arr, teller+1, slutt);//høyre for pivot

    }



    /* Sortering ved bruk av Utplukkssortering
    algoritmen som er fulgt er ifra visualiseringen:
     https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif
    */
    public int[] selectionSort(int[] arr){
        int lengde = arr.length;
        int min; // indeksen på det minste tallet hittil
        for (int i = 0; i < lengde; i++){ //for hvert element i hele arrayet
            min = i;
            for (int j = min+1; j < lengde; j++){ //starter på indekset etter i
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr, i, min);
            //System.out.println(Arrays.toString(arr));
        }
        //System.out.println("Sortert: " + Arrays.toString(arr));
        return arr;
    }


    //bruker psuedokoden fra gruppetime https://www.uio.no/studier/emner/matnat/ifi/IN2010/h19/grupper/gruppe-4/uke-8/uke8.pdf
    public void heapSort(int[] arr){ //in place
        for (int i = 1; i < arr.length; i++){ //bygger opp den vanlige usorterte maxheapen
            buildHeap(arr, i);
        }

        for (int i = (arr.length-1); i > 0; i--){
            if (i == 1 && arr[0] < arr[1]){
                return;
            } else{
                swap(arr, 0, i);
                synk(arr, 0, i);
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public void synk(int[] arr, int denne, int grense){
        //System.out.println("\nHeapsortert: " + Arrays.toString(arr));
        int vbx = denne*2+1;
        if (vbx >= grense){return;}
        int vb = arr[vbx];
        int hbx = denne*2+2;
        if (hbx >= grense){return;}
        int hb = arr[hbx];
        //System.out.println("Denne: " + arr[denne] + " vb: " + vb + " hb: " + hb);

        if (arr[denne] <= vb && vb >= hb){
            swap(arr, denne, vbx);
            synk(arr, vbx, grense);
        } else if (arr[denne] < hb && hb > vb){
            swap(arr, denne, hbx);
            synk(arr, hbx, grense);
        }
    }

    public void buildHeap(int[] arr, int denne){
        int fx = (denne - 1) / 2; //foreldreindex
        if (arr[denne] <= arr[fx]){
            return;
        } else{
            swap(arr, denne, fx);
            buildHeap(arr, fx);
        }
    }

    //hjelpemetode som bytter verdiene ved to indekser i en gitt array
    public static void swap(int[] arr, int numeroUno, int numeroDoso){
        int temp = arr[numeroUno];
        arr[numeroUno] = arr[numeroDoso];
        arr[numeroDoso] = temp;
        //System.out.println("Byttet " + arr[numeroUno] + " og " + arr[numeroDoso]);
    }

}
