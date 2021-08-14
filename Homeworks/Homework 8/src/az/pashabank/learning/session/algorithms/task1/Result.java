package az.pashabank.learning.session.algorithms.task1;

import java.util.List;

public class Result {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] types = new int[5];

        for (int i = 0; i < arr.size(); i++) {
            switch(arr.get(i)){
                case 1:
                    types[0]++;
                    break;
                case 2:
                    types[1]++;
                    break;
                case 3:
                    types[2]++;
                    break;
                case 4:
                    types[3]++;
                    break;
                case 5:
                    types[4]++;
                    break;
            }
        }

        int max = types[0];
        int index = 1;
        for(int j = 1; j<types.length;j++){
            if(max < types[j]){
                max = types[j];
                index = j+1;
            }
        }
        return index;
    }
}
