public class Cipher {
    private CipherAlgBase alg;
    public Cipher(CipherAlgBase alg){
        this.alg = alg;
    }
    public void setCipherAlg(CipherAlgBase alg){
        this.alg = alg;
    }
    public String encrypt(String text, int key) {
        return alg.processText(text, key);
    }
    public String decrypt(String text, int key) {
        return alg.processText(text, -key);
    }
}
