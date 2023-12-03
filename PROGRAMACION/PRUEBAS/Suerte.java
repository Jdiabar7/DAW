public class Suerte {
    public static void main(String[] args) {

        boolean finalBool = false;

        do {

            System.out.println("press enter");
            System.console().readLine();

            int num = (int) (Math.random() * 2) + 1;
            switch (num) {
                case 1:
                    System.out.println();
                    System.out.println("Roja");
                    finalBool = true;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Blanca");
                default:
                    break;
            }

        } while (finalBool != true);

    }
}





