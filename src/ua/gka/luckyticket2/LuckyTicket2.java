package ua.gka.luckyticket2;

public class LuckyTicket2 {
    public static void main(String[] args) {
        int countOfNumbers = 6;
        String s = "%0" + countOfNumbers + "d%n";
        int key1;
        int key2;
        for (int i = 0; i < (int) Math.pow(10, countOfNumbers); i++) {
            key1 = 0;
            for (int j = 0; j < countOfNumbers / 2; j++) {
                key1 = key1 + i / (int) Math.pow(10, j) % 10;
            }
            key2 = 0;
            for (int j = countOfNumbers / 2; j < countOfNumbers; j++) {
                key2 = key2 + i / (int) Math.pow(10, j) % 10;
            }
            if (key1 == key2) {
                System.out.printf(s, i);
            }
        }
    }
}



