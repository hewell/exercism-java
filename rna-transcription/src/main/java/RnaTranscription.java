class RnaTranscription {

    String transcribe(String dnaStrand) {
        String str = "";
        char[] chars = dnaStrand.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
            case 'G':
                str += 'C';
                break;
            case 'C':
                str += 'G';
                break;
            case 'T':
                str += 'A';
                break;
            case 'A':
                str += 'U';
                break;
            default:
            }
        }
        return str;
    }

}
