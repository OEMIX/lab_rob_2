package com.company;

public class Shop {
    String storage;//склад
    String mainHall;//головний зал
    String toilet;//вбиральня


    public Shop(String storage, String mainHall, String toilet) {
        this.storage = storage;
        this.mainHall = mainHall;
        this.toilet = toilet;

    }

    void main_hall(int height, int width, int length){
        System.out.println("Площа магазину : "+height*width*length);
    }

    int storage(int height, int width,int length ) {
        return height * width * length;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Перевизначити  метод
    void main_hall(double height, double width, double length){
        System.out.println("Площа магазину : "+height*width*length);
    }
        //метод з статичним ім’ям та динамічною логікою
    void sleep(double height, double width, double length){
        System.out.println("Площа вбиральні : "+height*width*length);
    }





}
