package Module;

public class LuckyTickets {
    public static void main(String[] args){
        int totalLuckyTickets = 0;
        String line = "";
        for (int i = 0; i < 1000000; i++){
            String number = String.format("%06d", i);
            int sum1 = 0, sum2 = 0;
            for (int r = 0; r < 3; r++){
               sum1 += number.charAt(r);
               sum2 += number.charAt(r+3);
            }
            if (sum1 == sum2) {
                line += number + " ";
                totalLuckyTickets++;
            }
            if (line.length() >= 224) {
                System.out.println(line);
                line = "";
            }
        }
        System.out.println("\n\nTotal number of possible lucky tickets: " + totalLuckyTickets);
    }
}
