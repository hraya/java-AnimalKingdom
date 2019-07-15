package com.lambdaschool;

public abstract class AbstractAnimal
{
    int maxId;
    int id;
    int energy;
    String name;
    int year;

//    public AbstractAnimal()
//    {
//        maxId = 0;
//        energy = 5;
//    }

    public AbstractAnimal(int energy, String name, int year)
    {
        maxId++;
        this.id = maxId;
        this.energy = energy;
        this.name = name;
        this.year = year;

    }

    public abstract String getName();
    public abstract int getYear();
    public abstract String howMove();
    public  abstract String howBreath();
    public abstract String howReproduce();


    public void eat(int i)
    {
        energy++;
    }

    public void move()
    {
        energy--;
    }

    public void move(int steps)
    {
        energy = energy - steps;
    }
}
