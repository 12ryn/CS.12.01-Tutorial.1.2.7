import java.lang.reflect.Array;
import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {

        int number = num;

        if(number < 0){

            throw new IllegalArgumentException(

                    "The number passed to the constructor (" + num + ") cannot be negative!"
            );
        }
        digitList = new ArrayList<>();
        int flag = 0;

        if(num == 0){

            digitList.add(0);

        } else {

            while(number > 0){

                flag = number % 10;
                digitList.add(0, flag);
                number /= 10;
            }

        }

    }

    public boolean isStrictlyIncreasing()
    {
        ArrayList<Integer> newList = new ArrayList<>(getDigitList());

        for(int i = 0; i < newList.size() - 1; i++){ // if size is 1, the loop doesnt happen therefore immediately true

            if(newList.get(i) >= newList.get(i + 1)){

                return false;

            }

        }

        return true;

    }

    public ArrayList<Integer> getDigitList() {

        return digitList;

    }
}
