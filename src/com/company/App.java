package com.company;

/**
 * Требуется реализовать паттерн Builder, суть которого заключается в простом создании объектов.Задача звучит следующим образом: нужно создать несколько объектов Hero, однако нельзя использовать его конструктор, т.к. он требует инициализации большого количества параметров. Вместо этого нужно использовать Builder class. У каждого объекта Hero должны заполняться параметры: Оружие, Броня, Класс. После создания нескольких объектов необходимо выводить информацию о них в консоль.
 */
public class App {
    public static void main(String[] args) {
        Hero archer = new Hero.Builder()
                .withArmor(Armor.BOOTS)
                .withClazz(Clazz.ARCHER)
                .withWeapon(Weapon.BOW)
                .build();
        Hero warrior = new Hero.Builder()
                .withArmor(Armor.HELM)
                .withClazz(Clazz.WARRIOR)
                .withWeapon(Weapon.SPEAR)
                .build();
        System.out.println(archer.print());
        System.out.println(warrior.print());
    }
}
