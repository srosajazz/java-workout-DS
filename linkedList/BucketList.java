import java.util.LinkedList;

public class BucketList {
    public static void main(String args[]) {
        LinkedList travelStates = new LinkedList<>();

        // Add Items
        travelStates.add("Minas Gerais, Brasil");
        travelStates.add("Rio de Janeiro, Brasil");
        travelStates.add("Sao Paulo, Brasil");
        travelStates.add(2, "Englad, Paris");
        System.out.println(travelStates);

        // Accessing the data
        System.out.println((travelStates.get(2)));
        // getFirst & getLast options
        System.out.println(travelStates.getFirst());
        System.out.println(travelStates.getLast());

        // contains |true or false
        System.out.println(travelStates.contains("Minas Gerais, Brasil"));

        // Remove Items
        travelStates.removeFirst();
        travelStates.removeLast();
        System.out.println(travelStates);

        // Remove by index
        travelStates.remove("Rio de Janeiro, Brasil");
        travelStates.remove(0);
        System.out.println(travelStates);

    }
}