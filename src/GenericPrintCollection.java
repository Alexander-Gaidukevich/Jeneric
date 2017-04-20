import java.util.List;

public class GenericPrintCollection {

    public static <T extends Animal> void printData(List<? extends Animal> list) {

        for (Animal animal : list) {
            System.out.println(animal);
        }

    }

}
