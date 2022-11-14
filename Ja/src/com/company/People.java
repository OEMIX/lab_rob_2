package com.company;

public class People {
    int customers; //клієнти
    int security; //охорона
    int cashier; //касир
    String chief_cashier; //касир
    String chief_security; //начальник охорони


    public People(int customers,int security, int cashier,String chief_cashier, String chief_security) {
        this.customers = customers;
        this.chief_cashier = chief_cashier;
        this.chief_security = chief_security;
        this.security = security;
        this.cashier = cashier ;
    }

    void average_amount() {
        System.out.println("Середня кількість клієнтів в магазин : "+ customers);
    }

    int cashiers_salary(){
        int monthly = 11000;
        if((customers*30)>250){
            monthly += 2500;
        }
        int yearly = monthly*12;
        return yearly ;
    }

    int security_salary(){
        int monthly = 15200;
        int yearly = monthly*12;
        return yearly;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //метод з статичним ім’ям та динамічною логікою
    void sleep(){
        int Earnings = (500*customers)*30;
        System.out.println("Середній прибуток за місяць : "+Earnings);
    }
        //перевизначити конструктор
    public People() {
    }

    public People(int customers) {
        this.customers = customers;
    }

    public People(int customers, String chief_cashier) {
        this.customers = customers;
        this.chief_cashier = chief_cashier;
    }
    //метод посилкового типу
    People new_price (){
        People people = new People(customers + 10, security * 2, cashier + 4,chief_cashier+" Василівка",chief_security+" Ігорович");
        return people;
    }
}
