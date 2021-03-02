abstract public class CipherAlgBase {
    protected final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    abstract public String processText(String text, int key);
}
