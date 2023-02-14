package com.comarch.szkolenia.dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setAge(10);
        dog.setRace("Kundel");
        dog.setTailLength(30);
        dog.setCos(10);
        dog.walk();

        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setCos(10);
        cat.walk();
        cat.miaucz();

        Snake snake = new Snake();
        snake.walk();

        Pet[] pets = new Pet[10];
        pets[0] = new Cat();
        pets[1] = new Dog();
        pets[2] = new Snake();

        Pet pet = new Cat();
        if(pet instanceof Cat) {
            Cat kot = (Cat) pet;
            kot.miaucz();
        }

        Object object1 = new Cat();
        Object object2 = new Pet();
        Object object3 = new Dog();
        Object object4 = new Mammal();

        Dog dog1 = new Dog();
        dog1.setName("Rex");

        Dog dog2 = new Dog();
        dog2.setName("Rex");
        dog2.setRace("Owczarek");

        System.out.println(dog1.equals(dog2));
        System.out.println(dog2);

        System.out.println(new Cat());
    }
}
