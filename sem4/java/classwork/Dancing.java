import java.util.concurrent.TimeUnit;

class Dancing {
    public static void main(String[] args) {
        String dance = "HaRsHa";
        String newDance = "";

        while (true) {
            System.out.print("\033[H\033[2J");
            
            // Runtime.getRuntime().exec("clear");

            // clearConsole();
            for (int i = 0; i < dance.length(); i++) {
                char c = dance.charAt(i);
                if (Character.isLowerCase(c)) {
                    newDance += Character.toUpperCase(c);
                } else {
                    newDance += Character.toLowerCase(c);
                }
                // clearConsole();
            }
            System.out.println(newDance);
            dance = newDance;
            newDance = "";
    
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (Exception e) {
                //TODO: handle exception
            }


            
        }
    }
}