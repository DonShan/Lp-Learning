public class Main {

    public static void main(String[] args) {


        System.out.println();
        Random sc;
        int input = sc.nextInt();

        int output = 0;
        int length = (int) (Math.log10(input) + 1);


        do {
            int rem = input % 10;
            System.out.println(("\nrem =" + rem));

            System.out.println("length = " + length);

            for (int i = length - 1; i > 0; i--) {

                System.out.println("I = " + i);
                System.out.println("power = " + Math.pow(10, i));

                output = (int) (output + (rem * Math.pow(10, length - 1)));
                System.out.println("xxxx = " + rem * Math.pow(10, i));

                System.out.println("output = " + output + "\n");

            }

            System.out.println("input = " + input);
            input = input / 10;
            length = length - 1;


        }
    }
}
