package gr.codelearn.oop.model;

public enum Color {
    BLACK("#000000"), WHITE("#ffffff"), PINK("#mf2im8");

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
