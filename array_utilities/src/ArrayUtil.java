public class ArrayUtil {

    public static int[] take(int n, int[] xs)
    {
        int[] newArray = new int[n];

        for(int i = 0; i < n; i++)
        {
            newArray[i] = xs[i];
        }

        return newArray;
    }

    public static int[] drop(int n, int[] xs)
    {
        int[] newArray = new int[n];

        int start = xs.length - n;
        for(int i = 0; i < n; i++)
        {
            newArray[i] = xs[i + start];
        }

        return newArray;
    }


    public static boolean equals(int[] xs, int[] ys)
    {
        boolean is_equal = true;

        // Are the arrays the size size?
        if (xs.length == ys.length) {

            // Iterate through each item
            for (int i = 0; i < xs.length; i++) {

                // Are they equal
                if(xs[i] != ys[i])
                {
                    // Nope.  Not equal.
                    is_equal = false;
                    break;
                }
            }
        }
        else {
            is_equal = false;
        }

        return is_equal;
    }

    public static int[] concat(int[] xs, int[] ys) {
        int[] newArray = new int[xs.length + ys.length];

        int i = 0;
        for(int item : xs) {
            newArray[i++] = item;
        }
        for(int item : ys) {
            newArray[i++] = item;
        }

        return newArray;
    }

    public static String toString(int[] xs)
    {
        String text = "";

        boolean first = true;
        for(int item : xs) {

            if(first)
            {
                first = false;
            }
            else
            {
                text += ",";
            }
            text += Integer.toString(item);
        }

        return text;
    }

}
