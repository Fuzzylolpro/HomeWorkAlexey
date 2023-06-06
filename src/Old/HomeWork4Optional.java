package Old;

public class HomeWork4Optional {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        String white = "W";
        String black = "B";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if ((i + j) % 2 == 0)
                    System.out.print(white + " ");
                else
                    System.out.print(black + " ");
            System.out.println();
        }
    }
}
