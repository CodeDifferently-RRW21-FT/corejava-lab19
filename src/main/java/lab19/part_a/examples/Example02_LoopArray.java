package lab19.part_a.examples;

public class Example02_LoopArray {
    public static void main(String[] args) {
        int[] numbers = {14, 22, 89, 33};

        System.out.println("Using a for Loop:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}