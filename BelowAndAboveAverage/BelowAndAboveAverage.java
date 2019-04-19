import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class BelowAndAboveAverage {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(",");
        int[] arrInt=new int[array.length];
        String below="";
        String above="";
        String belowStr="";
        String belowStr1="";
        String aboveStr="";
        String aboveStr1="";

        int avg = 0;
        for (int i = 0; i <array.length; i++) {
            arrInt[i]=Integer.parseInt(array[i]);
            avg+=arrInt[i];
        }
        double avg1= (double)avg/array.length;

        for (int a = 0; a <arrInt.length; a++) {
            if (arrInt[a]<avg1) {
                String s=Integer.toString(arrInt[a]);
                below=below.concat(s+",");

            }else if(arrInt[a]>avg1){
                String s1=Integer.toString(arrInt[a]);
                above=above.concat(s1+",");

            }
        }

        String[] array1 = below.split(",");
        String[] array2 = above.split(",");



if (array1.length>1&&array1.length>1) {
            for (int a = 0; a < array1.length - 1; a++) {
                belowStr = belowStr.concat(array1[a] + ",");
                belowStr1 = array1[a + 1];
            }

            for (int b = 0; b < array2.length - 1; b++) {
                aboveStr = aboveStr.concat(array2[b] + ",");
                aboveStr1 = array2[b + 1];
            }

            System.out.println("avg: " + formatter.format(avg1));
            System.out.println("below: "+belowStr + belowStr1);
            System.out.println("above: "+aboveStr + aboveStr1);


        }else{


            for (int a = 0; a < array1.length; a++) {
                belowStr = belowStr.concat(array1[a]);
                //   belowStr1 = array1[a + 1];
            }

            for (int b = 0; b < array2.length; b++) {
                aboveStr = aboveStr.concat(array2[b]);
                //  aboveStr1 = array2[b + 1];
            }

            System.out.println("avg: " + formatter.format(avg1));
            System.out.println("below: "+belowStr);
            System.out.println("above: "+aboveStr);

        }
    }
}
