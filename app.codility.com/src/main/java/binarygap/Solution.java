package binarygap;

import java.util.logging.Logger;

public class Solution implements BinaryGap {
    Logger logger = Logger.getLogger(this.getClass().getName());
    public int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        logger.info(String.format("%s : %s", n, binaryString));
        int first = binaryString.indexOf((int)'1');
        int last  = binaryString.lastIndexOf((int)'1');
        // all zero, single one is "no binary gap" 
        if (first == last) {
            return 0;
        }
        // remove front zero(s) and backward zero(s) 
        binaryString = binaryString.substring(first, last);
        // create zeros array 
        String[] zeros = binaryString.split("1");
        int binaryGap = 0;
        for (String zero : zeros) {
            if (zero.length() > binaryGap) {
                binaryGap = zero.length();
            }
        }
        return binaryGap;
    }
}