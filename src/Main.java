public class Main {
    public static void main(String[] args) {
        //Part 1 forLoop Counting
        for (int count = 0; count <= 30; count++) {
            System.out.print(count + " ");
        }

        System.out.println();

        //Part 2 forLoop Counting Backwards
        for (int count = 30; count >= 0; count--) {
            System.out.print(count + " ");
        }

        System.out.println();

        //Part 3 forLoop Counting by 3
        for (int count = 0; count <= 18; count += 3) {
            System.out.print(count + " ");
        }

        System.out.println();

        //Part 4 forLoop Counting Backwards by 2
        for (int count = 10; count >= 0; count -= 2) {
            System.out.print(count + " ");
        }

        System.out.println();

        //Part 5 Figure

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Part 6 Figure

        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Part 7 figure
        for (int c = 0; c <= 4; c++)
        {
            for (int i = 0; i <= 4; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}