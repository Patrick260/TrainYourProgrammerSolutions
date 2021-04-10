public class FunktionWelcheMinimumUndMaximumAusEinemArrayZurückgibt {

    public static void main(String[] args) {
        int[] array = {1,4,8,2,0,3,6};
        System.out.println("Min: " + getMinMax(array)[0] + " Max: " + getMinMax(array)[1]);
    }

    private static int[] getMinMax(int[] array) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }

        }

        int[] minMax = {min, max};
        return minMax;
    }
}
