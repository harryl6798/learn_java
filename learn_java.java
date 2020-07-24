//Sandbox to play with Java functionarliy 

import java.util.*;

public class learn_java{
    public static void main(String[] args) {

        List list = new ArrayList();

        //Array List Implementation
        List<dog> dogList = new ArrayList<dog>();
        dog myDog = new dog(100000);
        dogList.add(myDog);
        // dogList.remove(myDog);
        dogList.add(0, myDog);
        // dogList.clear();

        //Parsing Integer and Conversions
        var myVal = "1234";
        int wacky = Integer.parseInt(myVal);
        wacky +=16;
        // System.out.println(wacky);

        //Hashmaps
        HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();

        myMap.put(1, 100);
        int check = myMap.get(1);
        // System.out.println(check);
        dog maple = dogList.get(1);

        maple.bark();
        maple.name("Maple");
        dogList.add(maple);
        for(int i = 0; i<10; i++){
            dog newDog = new dog(1000000);
            dogList.add(newDog);
        }

        //Testing Enums
        maple.setAnimalType("Omnivore");
        maple.printAnimalType();

        //Testing Lists
        dogList.get(1).name("Jared");
        // System.out.println(dogList.get(1).name());
        
        // System.out.println("My name is: " + dogList.get(0).name());

        return;
    }
}

class dog extends Animal{
    dog( int count) {
        super("Dog", count);
        midco();
        // TODO Auto-generated constructor stub
    }

    static void midco(){
        System.out.println("OUR SPEEDS HAVE NEVER BEEN SLOWER");
    }
    String name;
    void bark(){
        System.out.println("Bark");
    }
    void name(String s){
        name = s;
    }
    String name(){
        if(!name.isEmpty()){
            return name;
        }
        return "There is no name set";
    }
}

class Animal{
    String animalKind;
    int animalNumbers;
    enum animalType{
        Herbivore, Carnivore, Omnivore, Jellyfish;
    } 
    animalType animal_type;

    Animal(String animal_kind, int count ){
        animalKind = animal_kind;
        animalNumbers = count;
    }

    void setAnimalType(String typeOfAnimal){
        switch (typeOfAnimal){
            case "Herbivore":
                animal_type = animalType.Herbivore;
                break;
            case "Carnivore":
                animal_type = animalType.Carnivore;
                break;
            case "Omnivore":
                animal_type = animalType.Omnivore;
                break;
            default:
                animal_type = animalType.Jellyfish;
        }
    }
    void printAnimalType(){
        System.out.println(animal_type);
    }

    
}