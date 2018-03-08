class Twofer {

    private String twofer = "One for you, one for me.";

    String twofer(String name) {
        if (name == null) {
            return twofer;
        }
        return twofer.replace("you", name);
    }
}
