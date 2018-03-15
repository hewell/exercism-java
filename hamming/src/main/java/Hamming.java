class Hamming {
    private char[] leftArr;
    private char[] rightArr;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        leftArr = leftStrand.toCharArray();
        rightArr = rightStrand.toCharArray();
    }

    int getHammingDistance() {
        int dist = 0;
        for (int i = 0; i < leftArr.length; i++) {
            if (leftArr[i] != rightArr[i]) {
                dist++;
            }
        }
        return dist;
    }

}
