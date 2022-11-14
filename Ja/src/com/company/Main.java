package com.company;
public class Main {

    public static void main(String[] args) {

        Products pro = new Products("Лосось, Матіс, Скумбрія","Телятина, баранина, курятина","Хліб, булочки, печиво");
        pro.typesOFmeat();
        System.out.println("Середня ціна м'яса :"+ pro.price(79,189,165));
        System.out.println();

        People p = new People(36,2,2,"Наталя","Олер");
        p.average_amount();
        System.out.println("Річна зарплата касира : "+ p.cashiers_salary());
        System.out.println("Річна зарплата охоронця : "+ p.security_salary());
        System.out.println();

        Shop s = new Shop("Склад","головний зал","туалет");
        s.main_hall(2,12,16);
        System.out.println("Площа складу : "+s.storage(4,9,11));

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();

        //Перевизначити  метод
        s.main_hall(2.3,12,16.67);

        //метод з статичним ім’ям та динамічною логікою
        pro.sleep(25.50,59.99,12.25);
        s.sleep(1.2,4.4,3);
        p.sleep();

        // перевизначити конструктор
        People people1 = new People();
        People people2 = new People(36);
        People people3 = new People(36,"Наташа");

        //метод посилкового типу
        p.new_price();

        //методу із класу, екземпляр якого передано в якості параметру
        pro.produkt(pro);
    }
}
