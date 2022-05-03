public class AscendingSequence {

    public int[]  ascendingSequence(int start, int end, int step ){
        if (step > 0 && start < end) {
            int[] result = new int[(end - start + 1) / step];

            for (int i = 0; i < result.length; i++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }
            return result;
        }
        return new int[]{};
    }
}
