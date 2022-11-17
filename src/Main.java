import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class

public class Main {
    public static void main(String[] args) {
        String[] gifters = {"Bailey", "Brandon", "Brienna", "Jaysson"};

        ArrayList<Integer> numbersArray = new ArrayList<>();
        for (int i = 0; i < gifters.length; i++) {
            //generate numbers until its valid (index value can not equal generated number, and it cant already be generated)
            boolean numberInvalid = true;
            while(numberInvalid){
                int randomNum = (int)(Math.random() * gifters.length);
                if (!numbersArray.contains(randomNum) && (numbersArray.size()+1)!=(randomNum+1)){
                    numbersArray.add(randomNum);
                    numberInvalid=false;
                }
            }
        }

        ArrayList<String> giftees = new ArrayList<>();
        for (int gifterIndex : numbersArray) {
            giftees.add(gifters[gifterIndex]);
        }

        // Create a HashMap object called people
        HashMap<String, String> secretSanta = new HashMap<>();
        for (int i = 0; i < gifters.length; i++) {
            // Add keys and values (Name, Age)
            secretSanta.put(gifters[i], giftees.get(i));
        }

        for (String i : secretSanta.keySet()) {
            System.out.println(i + " will gift for " + secretSanta.get(i));
        }
    }
}