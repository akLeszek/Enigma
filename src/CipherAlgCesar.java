public class CipherAlgCesar extends CipherAlgBase{
    @Override
    public String processText(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            if (!Character.isLetter(text.charAt(i))){
                sb.append(text.charAt(i));
            }
            else {
                int ch = text.charAt(i);
                int j = alpha.indexOf(ch);
                j = (j + key + alpha.length()) % alpha.length();
                sb.append(alpha.charAt(j));
            }
        }
        return sb.toString();
    }
}
