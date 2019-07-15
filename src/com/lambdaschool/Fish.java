package com.lambdaschool;

public class Fish extends AbstractAnimal
{
    public String name;
    public int year;

    public Fish(int energy, String name, int year)
    {
        super(energy,name, year);
        this.energy += 2;
        this.name = name;
        this.year = year;
    }

//    public Fish(String name, String year)
//    {
//        this.name = name;
//        this.year = year;
//    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    @Override
    public String howMove()
    {
        return "Swim";
    }

    @Override
    public String howBreath()
    {
        return "gills";
    }

    @Override
    public String howReproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "Named: " + name + '\'' +
                ", Year Named: " + year +
                "}";
    }
}
