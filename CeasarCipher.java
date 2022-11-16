
public class CeasarCipher {
    String plainText; // du lieu nguyen goc chua ma hoa
    int key ; // => RotKet

    public CeasarCipher(String plainText) {
        this.plainText = plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    public String encrypt(){
        char[] a = plainText.toCharArray();
        int m=0;
        for(int i=0;i<plainText.length();i++){
            m=0;
            if(a[i] < 65) continue;
            
            if(a[i] >=65 && a[i]<=90){
             a[i] = (char) (((int) a[i]) + 32) ;
             m=1;
            }
               
            a[i] = (char) (((int) (a[i] + key - 96) % 26 + 96));
           if(a[i]== 96) a[i]=122;
            if(m==1) a[i] = (char) (((int) a[i]) - 32) ;
        }
   String cipherText = new String(a);
       return cipherText;    
    }
    
    public static String decrypt(String cipherText, int key) {
        String encryptedText = cipherText;
        char[] a = encryptedText.toCharArray();
        int m=0;
        for(int i=0;i<encryptedText.length();i++){
            m=0;
            if(a[i] < 65) continue;
            
            if(a[i] >=65 && a[i]<=90){
             a[i] = (char) (((int) a[i]) + 32) ;
             m=1;
            }
              
            a[i] = (char) (((int) (a[i] + (26-key) - 96) % 26 + 96));
           if(a[i]== 96) a[i]=122;
            if(m==1) a[i] = (char) (((int) a[i]) - 32) ;
        }
        String decipherText = new String(a);
       return decipherText;
      
    }
    
        
   
}
