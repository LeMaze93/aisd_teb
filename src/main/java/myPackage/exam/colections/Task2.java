package myPackage.exam.colections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    //przynajmniej 10 elementów, pokrywająca większość przypadków i umożliwiająca po wyświetlonych danych ocenić działanie programu

    static Car car1 = new Car(true, 2019, 3, 0, 95000);
    static Car car2 = new Car(false, 2008, 1, 1, 40000);
    static Car car3 = new Car(false, 2002, 1, 2, 27000);
    static Car car4 = new Car(true, 2021, 3, 3, 150000);
    static Car car5 = new Car(false, 2010, 2, 4, 55000);
    static Car car6 = new Car(true, 2021, 3, 5, 125000);
    static Car car7 = new Car(true, 2019, 2, 6, 70000);
    static Car car8 = new Car(true, 2019, 3, 7, 90000);
    static Car car9 = new Car(false, 2007, 1, 8, 38000);
    static Car car10 = new Car(true, 2019, 2, 9, 110000);

    private static List<Car> carList = new LinkedList<>(Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10)); //todo ma być posortowana po roczniku, auta nowesze jako pierwsze a starsze później, i stale utzymywać porządek

    public static List<Car> getCarList(){ //TIP singleton
        //zwraca aktualny stan listy aut
        //todo
        return null;
    }

    public static void printSortedCars() {
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie DOBRYCH danych testowych jest cześcią zadania)
        //lista ma być posotrowana po atrybutach w następującej kolejności:
        //- auta ekskluzywne mają znajdować się na początku listy
        //- auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //- auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //- auta droższe mają być wyświetlane przed tańszymi

        Collections.sort(carList);
        for(Car cars : carList) {
            System.out.println(cars);
        }
    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment){
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        // oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzację, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        //todo tutaj wykonaj zadanie
    }

    public static void addCarsToList() {
        //todo
    }

    public static void removeCarFromList() {
        //todo
    }

    public static void printCarListAfterSomeModification(){
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        // wyświetl listę
    }

}
