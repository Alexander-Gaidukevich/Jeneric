import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Cat cat = new Cat("name1", "type1");
        Cat cat1 = new Cat("nam2", "typ2");

        List<Cat> catList = new ArrayList<Cat>();
        catList.add(cat);
        catList.add(cat1);

        Dog dog1 = new Dog("n1", "w1");
        Dog dog2 = new Dog("n3", "w4");
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(dog1);
        dogList.add(dog2);

        Mouse mouse1 = new Mouse("m1");
        Mouse mouse2 = new Mouse("m2");

        List<Mouse> mouseList = new ArrayList<Mouse>();
        mouseList.add(mouse1);
        mouseList.add(mouse2);

        GenericPrintCollection.printData(catList);
        GenericPrintCollection.printData(dogList);
        GenericPrintCollection.printData(mouseList);

        List<Animal> integersList = new ArrayList<Animal>();

        integersList.add(new Animal("tttttttt"));
        integersList.add(new Dog("rrrrrrrrr", "fdgggdgdgdr"));
        integersList.add(new Cat("wwwwwww", "dkjfs"));

        GenericPrintCollection.printData(integersList);
    }
}