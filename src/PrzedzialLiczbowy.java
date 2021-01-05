public class PrzedzialLiczbowy {
    public static void main(String[] args) {
        int i = 427;
        while (i < 530) {
            if (i % 3 == 0) {
                System.out.println("Tik");
            } else if (i % 5 == 0) {
                System.out.println("Tak");
            } else if (i % 15 == 0) {
                System.out.println("TikTak");
            }
            i++;
        }
    }
}

