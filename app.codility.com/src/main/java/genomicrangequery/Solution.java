package genomicrangequery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Character, Integer> nucleotides = new HashMap<>() {
        {
            put('A', 1);
            put('C', 2);
            put('G', 3);
            put('T', 4);
        }
    };

    public int[] solution(String S, int[] P, int[] Q) {
        int[] M = new int[P.length];
        int[] impactFactors = new int[S.length()];
        // translate to impact factors from DNA.
        for (int i = 0; i < S.length(); i++) {
            impactFactors[i] = nucleotides.get(S.charAt(i));
        }
        for (int i = 0; i < M.length; i++) {
            int[] partOfImpactFactors = Arrays.copyOfRange(impactFactors, P[i], Q[i] + 1);
            Arrays.sort(partOfImpactFactors);
            M[i] = partOfImpactFactors[0];
        }
        return M;
    }

    public int[] solutionTuneup(String S, int[] P, int[] Q) {
        int[] M = new int[P.length];
        int[][] prefixSum = new int[4][S.length() + 1];
        int a = 0, c = 0, g = 0, t = 0;
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case 'A':
                    a++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'G':
                    g++;
                    break;
                case 'T':
                    t++;
                    break;
                default:
                    break;
            }
            prefixSum[0][i + 1] = a;
            prefixSum[1][i + 1] = c;
            prefixSum[2][i + 1] = g;
            prefixSum[3][i + 1] = t;
        }
        for (int i = 0; i < M.length; i++) {
            int p = P[i];
            int q = Q[i] + 1;
            for (int j = 0; j < prefixSum.length; j++) {
                if (prefixSum[j][p] < prefixSum[j][q]) {
                    M[i] = j + 1;
                    break;
                }
            }
        }
        return M;
    }


}
