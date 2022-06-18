public class Telusko {
    public static void main(String[] args) {
        //Pattern to print -> TELUSKO
        for (int i = 1; i <= 7; i++) {
            //T
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //E
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 4 || i == 7 || j == 1)//(i == 1 || i==7 || i==4 || j==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //L
            for (int j = 1; j <= 7; j++) {
                if (i == 7 || j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //U
            for (int j = 1; j <= 7; j++) {
                if ((i == 7 && j != 1 && j != 7) || (j == 1 && i != 7) || (j == 7 && i != 7))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //S
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 && j != 1) || (i == 4 && j != 1 && j != 7) || (i == 7 && j != 7) || (j == 1 && i < 4 && i != 1) || (j == 7 && i > 4 && i != 7))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //K
            for (int j = 1; j <= 7; j++) {
                if(j == 1 || ((i == 1 || i == 7) && j == 7) || ((i == 2 || i == 6) && j == 6) || ((i == 3 || i == 5) && j == 5) || (i == 4 && (j == 4 || j == 2)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //O
            for (int j = 1; j <= 7; j++) {
                if(((j == 1 || j == 7) && i != 1 && i != 7) || ((i == 7 || i == 1) && j != 1 && j != 7))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}