package zajecia_1;
import java.util.ArrayList;
import java.util.Scanner;

public class read_until_zero {
    public static void main(String[] args) {
        ArrayList<Integer> listOfValues = new ArrayList<>() ;
        Scanner scan = new Scanner(System.in);
        Integer a;
        do {
            a=scan.nextInt();
            if (!a.equals(0)) listOfValues.add(a);
        } while (!a.equals(0));
        System.out.println(sumAndAverage(listOfValues));
        System.out.println(minMax(listOfValues));
    }

    public static String sumAndAverage(ArrayList<Integer> listOfValues){
        Integer sum=0;
        for (int i=0;i<listOfValues.size();i++){
            sum+=listOfValues.get(i);

        }
        return "suma: "+sum+" średnia: "+(double) sum/(listOfValues.size());

    }

    public static String minMax(ArrayList<Integer> listOfValues){
        int min = listOfValues.get(0);
        int max = min;
        for (int i=0;i<listOfValues.size();i++){
            if (min>listOfValues.get(i)) min=listOfValues.get(i);
            if (max<listOfValues.get(i)) max=listOfValues.get(i);
        }
        return "min: "+min+" max: "+max;

    }
}
