package com.lambdaschool;

public class Mammals extends AbstractAnimal
{
    public String name;
    public int year;

    public Mammals(int energy, String name, int year)
    {
        super(energy,name,year);
        this.energy += 2;
        this.name = name;
        this.year = year;
    }

//    public Mammals(String name, int year)
//    {
//        this.name = name;
//        this.year = year;
//    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getYear()
    {
        return year;
    }

    @Override
    public String howMove()
    {
        return "Walk";
    }

    @Override
    public String howBreath()
    {
        return "lungs";
    }

    @Override
    public String howReproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return "Mammal{" +
                "Named: " + name + '\'' +
                ", Year Name: " + year +
                "}";
    }
}
