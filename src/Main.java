import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Zadanie 1
//        Zadanie1(2);

//        Zadanie2();
    }
    public static double losowe(int a, int b){
        Random rand = new Random();
        int liczba = rand.nextInt(b-a+1)+a;
        return liczba;
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static int[] wypelnij(int[] array){
        for(int i :array){
            array[i] = (int) losowe(0, 10);
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    public static void Zadanie1(int dlugosc){
        int[] array = new int[dlugosc];
        int suma = 0;
        for(int i :array){
            array[i] = (int) losowe(0, 10);
        }
        for (var i = 0; i < array.length; i++) {
            suma += array[i];
        }
        System.out.println("Suma wynosi: " + suma + ", średnia to "+ (suma/ array.length));
    }
    public static void Zadanie2(){
        int dlugoscEven = (int) (losowe(0, 10 )*2);
        int dlugoscOdd = (int) (losowe(0, 5)) * 2 + 1;
        int[] arrayEven = new int[dlugoscEven];
        int[] arrayOdd = new int[dlugoscOdd];

        for(int i :arrayEven){
            arrayEven[i] = (int) losowe(0, 10);
        }
        System.out.println("Tablica Even");
        for(int i=0; i < arrayEven.length; i++){
            System.out.print(arrayEven[i] + ", ");
        }
        for(int i :arrayOdd){
            arrayOdd[i] = (int) losowe(0, 10);
        }
        System.out.println("\n Tablica Odd");
        for(int i=0; i < arrayEven.length - 2; i++){
            System.out.print(arrayOdd[i] + ", ");
        }
    }
    public static void Zadanie3(){
        String[] array = {"raz", "Dwa", "trzy", "cztery"};
//        for (string element: array) {
//            System.out.println(element.toUpperCase());
//        }

    }
    public static void Zadanie4(){
//        Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy. Następnie,
//                program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami
//        zapisanymi od końca do początku. Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i",
//                "psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".
    }
}