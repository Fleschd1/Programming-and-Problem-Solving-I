public class testing {
    public static void main(String[] args) {
        int[] values = { 4, 5, 6, 7};
        for (int i = 1; i < values.length; i++)
        {
        values[i] = values[i - 1] + values[i];
        }
        for (int i = 0; i < values.length; i++)
        {
        System.out.print (values[i] + " ");
        }
    }
}
