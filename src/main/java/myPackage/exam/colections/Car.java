package myPackage.exam.colections;

import java.util.UUID;

public class Car implements Comparable<Car> {
    Boolean isExclusive; //true or false
    Integer yearOfProduction; // eg 2021, 2015 etc
    Integer levelOfEquipment; // 3 > 2 > 1, higher then better
    UUID id;
    Double value; // how much does it cost for client

    //todo dodaj wszystkie brakujące metody do klasy aby móc jej używać w zadaniu Task2


    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, int id, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.id = UUID.randomUUID();
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isExclusive=" + isExclusive +
                ", yearOfProduction=" + yearOfProduction +
                ", levelOfEquipment=" + levelOfEquipment +
                ", id=" + id +
                ", price=" + value +
                '}';
    }

    @Override
    public int compareTo(Car otherCar) {
        int result = otherCar.isExclusive.compareTo(this.isExclusive);
        if (result == 0) {
            int result2 = otherCar.getYearOfProduction().compareTo(this.yearOfProduction);
            if (result2 == 0) {
                int result3 = otherCar.getLevelOfEquipment().compareTo(this.levelOfEquipment);
                if (result3 == 0) {
                    return otherCar.getValue().compareTo(this.getValue());
                }
                return result3;
            }
            return result2;
        }
        return result;
    }

    public boolean getExclusive() {
        return isExclusive;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getLevelOfEquipment() {
        return levelOfEquipment;
    }

    public Double getValue() {
        return value;
    }
}
