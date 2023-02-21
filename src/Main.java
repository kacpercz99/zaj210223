import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //zad1();
        zad2();
    }

    public static void zad1() {
        List<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Orange");
        colourList.add("White");
        colourList.add("Black");

        //colourList.forEach(System.out::println);
        for (int i = 0; i < colourList.size(); i++) {
            System.out.print(colourList.get(i) + " ");
        }
        System.out.println("\n---");
        for (int index = 2; index < colourList.size(); index++) {
            System.out.print(colourList.get(index) + " ");
        }
        System.out.println("\n---");
        for (int i = colourList.size() - 1; i >= 0; i--) {
            System.out.print(colourList.get(i) + " ");
        }
        System.out.println("\n---");
        colourList.add(0, "Pink");
//        for(int i=0; i< colourList.size(); i++){
//            if(colourList.get(i).equals("Black")) {
//                colourList.add(i, "Yellow");
//                break;
//            }
//        }
        colourList.add(colourList.indexOf("Black"), "Yellow");
        colourList.forEach(e -> System.out.print(e + " "));
        System.out.println("\n---");
        Iterator<String> colourListIterator = colourList.listIterator();
        while (colourListIterator.hasNext()) {
            System.out.print(colourListIterator.next() + " ");
        }
        System.out.println("\n---");
        System.out.println(colourList.get(0) + ", " + colourList.get(2));
        System.out.println("---");
        colourList.remove(2);
        System.out.println(colourList.contains("Red"));
        System.out.println("---");
        Collections.sort(colourList);
        System.out.println(colourList);
        System.out.println("---");
        List<String> color_list = Arrays.asList("Red", "Blue", "Green");
        colourList.addAll(color_list);
        System.out.println(colourList);
        System.out.println("---");
        List<String> subList = colourList.subList(0, 3);
        System.out.println(subList);
        System.out.println("---");
        colourList.removeAll(color_list);
        System.out.println(colourList);
        System.out.println("---");
        //color_list.clear();
        LinkedList<String> linkedColourList = new LinkedList<>();
        linkedColourList.add("Red");
        linkedColourList.add("Green");
        linkedColourList.add("Black");
        linkedColourList.add("White");
        linkedColourList.add("Pink");
        linkedColourList.add("Yellow");
        System.out.println(linkedColourList);
        linkedColourList.addFirst("Black");
        linkedColourList.addLast("Black");
        System.out.println("---");
        System.out.println(linkedColourList);
        System.out.println("---");
        System.out.println(linkedColourList.peek());
        List<String> convertedLinkedList = new ArrayList<>(linkedColourList);
        System.out.println(convertedLinkedList);
    }

    public static void zad2() {
        List<Passenger> passengerList =
                Arrays.asList(
                        new Passenger("Kacper", "Hehe", 23),
                        new Passenger("Kamil", "Konstanty", 67),
                        new Passenger("Jakis", "Pasazer", 69)
                );
        System.out.println(passengerList);
        Carriage carriage = new Carriage(2);
        passengerList.forEach(carriage::addPassenger);
        carriage.printCarriageInfo();
        System.out.println(carriage.howManyWithSeniorDiscount());
    }
}