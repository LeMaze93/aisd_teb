package myPackage.exam.recursion;

public class Task1 {

    public static void main(String[] args) {
        printNumberPyramid(5);
    }

    public static void printNumberPyramid(int numberOfPyramidLevels) {
        //Wypisz na konsolę, piramidę, wypisywać będziemy cyfrę 3 w formie string lub int, tj w pierwszej lini jedna cyfra 3, w drugiej lini dwie trójki, w trzeciej lini 3 cyfry itd
        //przykład wypisań na konsoli
        //3
        //33
        //333
        //3333
        //itd
        //Aż do liczby wierszy (poziomów piramidy), podanej jako parametr do funkcji przykład, printPyramid(int lvlNumber) {...}
        //TIP podziel problem na mniejsze części, rezultatem nie musi być jedna funkcja, ale funkcjonalność, tj jak wywołam jedną funkcję to wyświetli mi się piramida,
        //Uwaga, piramida może być wypisana jako "odwrócona" na konsolę tj dla numberOfPyramidLevels=3 ->
        //333
        //33
        //3

        //todo tutaj wykonaj zadanie

        for (int i = 1; i <= numberOfPyramidLevels; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("3");
            }
            System.out.println("");
        }
    }
}
