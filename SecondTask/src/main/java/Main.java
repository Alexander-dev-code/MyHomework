import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[] arr = str.split( "\n" );
        //System.out.println( Arrays.toString( arr ) );

        String[] a = arr[0].split( " " );
        String[] b = arr[1].split( " " );
        String[] c = arr[2].split( " " );
        String[] d = arr[3].split( " " );
        String[][] allArray = {a, b, c, d};


        String[][] allArray1 = new String[4][4];
        try {
            Sum( allArray );
            System.out.println(Arrays.toString( allArray1 ));
        } catch (Exception e) {
            System.out.println( "Something!" );
        }
        try {
            Integer format = Integer.valueOf(String.valueOf(allArray1));
            System.out.println(format);

        }catch (NumberFormatException e) {
            System.err.println("Invalid string format!");
        }
    }

    public static void Sum(String[][] allArray) {
        int sum = 0;
        for (int i = 0; i < allArray.length; i++){
            for(int j = 0; j < allArray.length; j++ ){
                sum += Integer.parseInt(allArray[i][j]);
            }
        }
        int separator = sum / 2;
        //System.out.println(sum);
        System.out.println(separator);
    }
}

