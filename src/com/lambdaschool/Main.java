package com.lambdaschool;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // Animals Type Mammal
        AbstractAnimal Panda = new Mammals(200,"Panda",1869);
        AbstractAnimal Zebra = new Mammals(150,"Zebra", 1778);
        AbstractAnimal Koala = new Mammals(100, "Koala", 1816);
        AbstractAnimal Sloth = new Mammals(100, "Sloth", 1804);
        AbstractAnimal Armadillo = new Mammals(90, "Armadillo", 1758);
        AbstractAnimal Raccoon = new Mammals(50,"Raccoon", 1758);
        AbstractAnimal Bigfoot = new Mammals(300, "Bigfoot", 2021);

        //Animals Type Birds
        AbstractAnimal Pigeon = new Birds(20,"Pigeon", 1837);
        AbstractAnimal Peacock = new Birds(25,"Peacock", 1821);
        AbstractAnimal Toucan = new Birds(20,"Toucan", 1758);
        AbstractAnimal Parrot = new Birds(20,"Parrot", 1824);
        AbstractAnimal Swan = new Birds(25,"Swan", 1758);

        // Animals Type Fish
        AbstractAnimal Salmon = new Fish(10, "Salmon", 1758);
        AbstractAnimal Catfish = new Fish(10, "Catfish", 1817);
        AbstractAnimal Perch = new Fish(10, "Perch", 1758);

        // ArrayList of All Animals
        ArrayList<AbstractAnimal> AnimalList = new ArrayList<AbstractAnimal>();
        AnimalList.add(Panda);
        AnimalList.add(Zebra);
        AnimalList.add(Koala);
        AnimalList.add(Sloth);
        AnimalList.add(Armadillo);
        AnimalList.add(Raccoon);
        AnimalList.add(Bigfoot);
        AnimalList.add(Pigeon);
        AnimalList.add(Peacock);
        AnimalList.add(Toucan);
        AnimalList.add(Parrot);
        AnimalList.add(Swan);
        AnimalList.add(Salmon);
        AnimalList.add(Catfish);
        AnimalList.add(Perch);

        System.out.println("*** Descending Order by year named *****");
        AnimalList.sort((a1,a2) -> a2.getYear() - a1.getYear());
        AnimalList.forEach(a -> System.out.println(a.getName() + " " + a.getYear()));

        System.out.println("\n**** Animals in Alphabetical Order ****");
        AnimalList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        AnimalList.forEach(a -> System.out.println(a.getName()));

        System.out.println("\n**** Animals order by how they move *****");
}
