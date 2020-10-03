import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of your array...");
        int size = scanner.nextInt();
        System.out.println("your array size is " + size);
        final ArrayList<Integer> inputArray = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter index = %d of your array...\n", i);
            int input = scanner.nextInt();
            inputArray.add(input);
            System.out.printf("index = %d of your array is %d\n", i, input);
        }
        final List<Integer> sortedArray = new ArrayList<>(inputArray);
        System.out.println(inputArray);
        Collections.sort(sortedArray);
        System.out.println(sortedArray);
        long count;
        count = inputArray.stream().filter(e -> !Objects.equals(sortedArray.get(inputArray.indexOf(e)), e)).count();
//        count = 0;
//        for (int i = 0; i < inputArray.size(); i++) {
//            if (inputArray.get(i) != sortedArray.get(i)) {
//                count++;
//            }
//        }
        System.out.println("The number of elements need changing to sort array :" + count);
    }
}
