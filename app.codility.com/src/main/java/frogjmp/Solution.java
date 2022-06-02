package frogjmp;

class Solution {
    public int solution(int x, int y, int d) {
        int distance = y - x;
        int count = distance / d;
        return distance % d == 0 ? count : count + 1;
    }
}