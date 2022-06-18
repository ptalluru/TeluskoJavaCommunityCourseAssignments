public class Ineuron {
    public static void main(String[] args) {
        //Pattern to print -> INEURON
        for (int i = 1; i <= 7; i++) {
            //I
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i==7 || j == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //N
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || (i==j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            //E
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 4 || i==7 || j==1)
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
            //R
            for (int j = 1; j <= 7; j++) {
                if(((i==1||i==4) && j!=7) || j==1 || (j==7 && i<4 && i>1) || (i==j && i>4))
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
            System.out.print("  ");
            //N
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || (i==j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
