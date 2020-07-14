import java.util.*;

public class learn_java{
    public static void main(String[] args) {

        List list = new ArrayList();

        List<dog> dogList = new ArrayList<dog>();
        dog myDog = new dog();
        dogList.add(myDog);
        dogList.remove(myDog);
        dogList.add(0, myDog);


        dog maple = dogList.get(0);

        maple.bark();
        maple.name("Maple");
        dogList.add(maple);
        for(int i = 0; i<10; i++){
            dog newDog = new dog();
            dogList.add(newDog);
        }

        dogList.get(1).name("Jared");
        System.out.println(dogList.get(1).name());
        
        System.out.println("My name is: " + dogList.get(0).name());

        return;
    }
}

class dog{
    String name;
    dog(){

    }
    dog(String s)
    {
        name = s;
    }
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