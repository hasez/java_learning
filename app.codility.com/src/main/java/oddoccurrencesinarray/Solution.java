package oddoccurrencesinarray;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Solution {

    Logger logger = Logger.getLogger(this.getClass().getName());

    enum ReturnCode {
        /** Paired All */
        NOT_REMAIN(0),
        /** EMPTY Array */
        INVALID_ARRAY(-1);

        private int code;

        private ReturnCode(int code) {
            this.code = code;
        }
        public int intValue() {
            return code;
        }

    }

    public int solution(int[] A) {
        if (A == null || A.length == 0) return ReturnCode.INVALID_ARRAY.intValue();
        Map<Integer, Integer> pairSearchedMap = new HashMap<>();
        for (int a : A) {
            if (pairSearchedMap.containsKey(a)) {
                pairSearchedMap.remove(a);
            } else {
                pairSearchedMap.put(a, a);
            }
        }
        if (pairSearchedMap.size() == 0) return ReturnCode.NOT_REMAIN.intValue();
        return pairSearchedMap.keySet().iterator().next().intValue();
    }
}