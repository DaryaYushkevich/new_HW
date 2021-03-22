package com.company;

public class Car {

       /* 1) Класс "Car" представляет собой автомобиль.
                Имеет следующие свойства:* Цвет *Модель (неизменяемая)* Год выпуска (неизменяемый)* Размер колес* Обьем двигателя (неизменяемая)
                * Список опций (Могут быть, а могут и нет)
        Автомобилю можно:* Сменить свет* Сменить размер колес* Изменять список опций (Добавлять\Удвлять)
        Ожидается возможность вывода на экран информации об автомобиле.*/

    private String color;
    public final String MODEL = " X";
    public final int YEAR = 2021;
    private int wheel_size;
    public final double ENGINE_VOLUME = 1.9;
    private String transmission;
    private int horsepower;

     Car(String color, String MODEL, int YEAR, int wheel_size, double ENGINE_VOLUME, String transmission, int horsepower) {
        this.color = color;
        this.wheel_size = wheel_size;
        this.transmission = transmission;
        this.horsepower = horsepower;
    }
    public void printCar() {
        System.out.println("Model: " + MODEL);
        System.out.println("Color: " + color);
        System.out.println("Year: " + YEAR);
        System.out.println("Wheel size: " + wheel_size);
        System.out.println("Engine volume: " + ENGINE_VOLUME);
        System.out.println("Transmission: " + transmission);
        System.out.println("Horsepower: " + horsepower);

    }
}