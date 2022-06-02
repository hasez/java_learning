package cyclicrotation;

import java.util.logging.Logger;

public class Solution implements CyclicRotation {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public int[] solution(int[] a, int k) {
        int length = a.length;
        if (length == 0) {
            return a;
        }
        int shiftCount = k % length;
        int lastPos = length - 1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int toPos = lastPos < (i + shiftCount) ? shiftCount - (lastPos - i) - 1 : (i + shiftCount);
            result[toPos] = a[i];
        }
        logger.info(String.format("%s : %s", a, result));
        return result;
    }
}
