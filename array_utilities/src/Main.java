public class Main {

    public static void main(String[] args) {


        int[] intList = new int[5];

        int[] intList2 = { 0, 10, 15, 20, 25};
        /*intList[0] = 1;
        intList[1] = 3;
        intList[2] = 5;
        intList[3] = 7;
        intList[4] = 9;*/

        int value = 0;
        for(int i = 0; i < 5; i++)
        {
            intList[i] = value;
            value++;
        }

        int[] takeArray = ArrayUtil.take(3, intList);
        for(int i : takeArray) {
            System.out.println(i);
        }

        int[] dropArray = ArrayUtil.drop(3, intList);
        for(int i : dropArray) {
            System.out.println(i);
        }

        boolean is_equal = ArrayUtil.equals(intList, intList2);
        if(is_equal) {
            System.out.println("Equal = true");
        }
        else
        {
            System.out.println("Equal = false");
        }

        int[] concatArray = ArrayUtil.concat(intList, intList2);
        for(int i : concatArray) {
            System.out.println(i);
        }

        String s = ArrayUtil.toString(intList);
        System.out.println(s);
        //ArrayUtil.take(10, )
    }
}

