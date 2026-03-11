public class Problem8 {

    String[] table = new String[500];

    int hash(String plate) {
        return Math.abs(plate.hashCode()) % table.length;
    }

    public void parkVehicle(String plate) {

        int index = hash(plate);

        while (table[index] != null)
            index = (index + 1) % table.length;

        table[index] = plate;

        System.out.println("Parked at spot " + index);
    }

    public static void main(String[] args) {

        Problem8 lot = new Problem8();

        lot.parkVehicle("ABC1234");
        lot.parkVehicle("XYZ5678");
    }
}