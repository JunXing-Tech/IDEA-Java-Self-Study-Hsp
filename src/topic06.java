public class topic06 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0)
                    System.out.println();
            }
        }
    }
}
