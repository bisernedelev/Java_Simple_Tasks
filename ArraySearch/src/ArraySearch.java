import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(",");
        int[] arrayInt = new int[array.length];
        boolean c = true;
        int[] result = new int[array.length];
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        int[] result2;

        for (int a = 0; a < array.length; a++) {
            arrayInt[a] = Integer.parseInt(array[a]);
        }


        for (int i = 1; i < arrayInt.length + 1; i++) {
            String string = i + "";
            c = Arrays.asList(array).contains(string);
            if (!c) {
                result[i - 1] = i;
            }

        }

        for (int z = 0; z < result.length; z++) {
            if (result[z] != 0) {
                idx++;
            }}

        if(array.length<=3){
            result2 = new int[3];
        }
        else{
            result2 = new int[idx];
        }

        for (int z1 = 0; z1 < result.length; z1++) {
            if (result[z1] != 0) {
                result2[idx1] = result[z1];
                idx1++;
            }
        }

        int[] result3= new int[idx];
        for (int j = 0; j <result2.length ; j++) {
            if (result2[j]!=0){
                result3[idx2]=result2[j];
                idx2++;
            }
        }



        if (array.length>3){

            for (int h = 0; h <result2.length-1 ; h++) {
                System.out.print(result2[h]+",");
            }
            System.out.print(result2[result2.length-1]);


        }else if(array.length>1&& array.length<3){
            for (int k = 0; k <result3.length-1 ; k++) {
                System.out.print(result3[k]+",");
            }
            System.out.print(result3[result3.length-1]);
        }else if(array.length==1&&!array[0].equals("1")){
            System.out.println("1");
        }
    }
}