public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 50000; i++) {
            String a = String.valueOf(i);
            if (a.contains("2")) {
                count++;
            }
        }
        System.out.println("Всего бракованных табличек - " + count);
    }
}
