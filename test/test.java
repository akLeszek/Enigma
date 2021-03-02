import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void TestCipherAlgCesarEncrypt(){
        int key = 1;
        String text = "abc !";
        Cipher cipher = new Cipher(new CipherAlgCesar());
        Assertions.assertEquals("BCD !", cipher.encrypt(text.toUpperCase(),key));
    }
    @Test
    public void TestCipherAlgCesarDecrypt(){
        int key = 1;
        String text = "bcd !";
        Cipher cipher = new Cipher(new CipherAlgCesar());
        Assertions.assertEquals("ABC !", cipher.decrypt(text.toUpperCase(),key));
    }
    @Test
    public void TestCipherAlgReverseEncrypt(){
        int key = 1;
        String text = "abc !";
        Cipher cipher = new Cipher(new CipherAlgReverse());
        Assertions.assertEquals("ZYX !", cipher.encrypt(text.toUpperCase(), key));
    }

    @Test
    public void TestCipherAlgReverseDecrypt(){
        int key = 1;
        String text = "zyx !";
        Cipher cipher = new Cipher(new CipherAlgReverse());
        Assertions.assertEquals("ABC !", cipher.decrypt(text.toUpperCase(), key));
    }
}
