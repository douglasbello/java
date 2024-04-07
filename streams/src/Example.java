public class Example {
    public static String staticField = "init";
    public String nonStaticField;

    public Example(String nonStaticField) {
        this.nonStaticField = nonStaticField;
    }

    @Override
    public String toString() {
        return "Example{" +
                "nonStaticField='" + nonStaticField + '\'' +
                "staticField='" + staticField + '\'' +
                '}';
    }
}
