public class Main {

    public static void main(String[] args) {
        int key = 1;
        String t = "ABC !";
        System.out.println("Text: " + t + "\n");

        Cipher c = new Cipher(new CipherAlgCesar());

        t = t.toUpperCase();

        t = c.encrypt(t, key);
        System.out.println("Encrypted: " + t);
        t = c.decrypt(t, key);
        System.out.println("Decrypted: " + t + "\n");

        c.setCipherAlg(new CipherAlgReverse());
        t = c.encrypt(t, key);
        System.out.println("Encrypted: " + t);
        t = c.decrypt(t, key);
        System.out.println("Decrypted: " + t + "\n");
    }
}
