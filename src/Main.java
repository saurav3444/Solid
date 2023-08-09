import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int arr[] = {7, 12 , 15 ,3 ,8 ,9 ,2 ,-2};
        int sum = 10;

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            countMap.put(arr[i], countMap.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++) {

            int reqVal = sum - arr[i];

            if(countMap.containsKey(reqVal)){

                if(reqVal!=arr[i]){
                    System.out.println(arr[i] + " " + reqVal);
                }else if(countMap.get(reqVal)>=2){
                    System.out.println(arr[i] + " " + reqVal);
                }

            }
        }


    }
}