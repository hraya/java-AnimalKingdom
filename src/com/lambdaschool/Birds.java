package com.lambdaschool;

public class Birds extends AbstractAnimal
{
    public String name;
    public int year;

    public Birds(int energy, String name, int year)
    {
        super(energy,name,year);
        this.energy += 2;
        this.name = name;
        this.year = year;
    }

//    public Birds(String name, int year)
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
        return "Fly";
    }

    @Override
    public String howBreath()
    {
        return "lungs";
    }

    @Override
    public String howReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Bird{" +
                "Named: " + name + '\'' +
                ", Year Named: " + year +
                "}";
    }
}
