package permcheck;

enum ReturnCode {
    /** is permutation. */
    IS_PERMUTATION(1),
    /** is not_permution. */
    IS_NOT_PERMUTATION(0);

    private int code;

    private ReturnCode(int code) {
        this.code = code;
    }
    public int intValue() {
        return code;
    }

}