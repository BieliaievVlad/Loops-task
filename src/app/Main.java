package app;


public class Main {
    static int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
    static int counter = 0;
    static int sum = 0;

    public static void main(String[] args) {

        for (int num : numbers) {
            counter++;
            sum += num;
            System.out.println(counter + ")Num is " + num + ", sum is " + sum);
        }
        System.out.printf("----------------------%nSum of numbers is %d",sum);

    }
    // Пытался присвоить значения через
    // numbers[0] = scan.nextInt();
    // numbers[1] = scan.nextInt();
    // но не вышло, значения не присваивались.

}

