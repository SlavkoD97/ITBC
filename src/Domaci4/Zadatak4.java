package Domaci4;

import java.util.Arrays;
class Main
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Kreira se privremeni int. temp, pomocu koga ce se zamijeniti mjesta indeksima (clanovima) niza.
    public static void selectionSort(int[] arr)
    {
// Prolazi se kroz petlju od prvog do predposlednjeg indeksa u nizu.
        for (int i = 0; i < arr.length - 1; i++)
        {
// kreira se novi int. (min) koji ce postati indeks (i) pri svakom prolasku kroz petlju, a zatim se pravi petlja u petlji,
            //sa novim indeksom (j) koji ce uvijek pocinjati od sledeceg clana posle indeksa (i), pa sve do poslednjeg clana niza.
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
            {
// Ovaj uslov ce provjeriti da li je svaki indeks (j) manji od int. (min) u nizu.
                if (arr[j] < arr[min]) {
                    min = j; // Sve dok indeksi (j) budu manji od min, min ce dobijati novu vrijednost (j), dok se ne posloze clanovi u nizu.
                }
            }
// Funkcija ce da zamijeni mjesta niza (arr), indeksa (min) i indeksa (J).

            swap(arr, min, i);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
        selectionSort(arr);
// Nad unesenim nizom (arr) ce se izvrsiti kreirana funkcija selectionSort, i ispisace se sortirani niz:
        //[-2,1,3,4,5,8,9]

        System.out.println(Arrays.toString(arr));
    }
}