
public class CeasarTest {
    public static void main(String args[]) {
        System.out.println("==================");
        System.out.println("Bài tập giải mã mật mã Ceasar:");
        System.out.println();
        
        CeasarCipher quanLenh1 = new CeasarCipher("Toi nay, dai quan danh chiem thanh Nha Ho luc 22:15, tai cong phia Tay"); 
        quanLenh1.setKey(7);
        String cipherText = quanLenh1.encrypt();
        System.out.println("Noi dung quan lenh da ma hoa: " + cipherText);
        String originalMessage = CeasarCipher.decrypt(cipherText, quanLenh1.getKey());
        System.out.println("Cac canh quan, khi nhan duoc ciphertext thi dung lenh tren de giai ma.");
        System.out.println("Noi dung quan lenh sau khi giai ma: " + originalMessage);
        
        System.out.println();
        System.out.println("==================");   
        System.out.println();
        
        CeasarCipher Respond1 = new CeasarCipher("5/5 canh quan da nhan lenh va chuan bi chien dau. San sang nhan lenh bat ki luc nao."); 
        Respond1.setKey(7);
        String cipherText1 = Respond1.encrypt();
        System.out.println("Noi dung tin nhan da ma hoa: " + cipherText1);
        String originalMessage1 = CeasarCipher.decrypt(cipherText1, Respond1.getKey());
        System.out.println("Noi dung tin nhan sau khi giai ma: " + originalMessage1);
        
        System.out.println();
        System.out.println("==================");   
        System.out.println();
        
        CeasarCipher test1 = new CeasarCipher("Bai tap nay se het han vao 12h ngay thu sau. Hay khan truong giai ma truoc khi qua muon."); 
        test1.setKey(12);
        String cipherText3 = test1.encrypt();
        System.out.println("Cac em hay giai ma doan mat ma sau (hint co trong doan code): " + cipherText3);
        String originalMessage3 = CeasarCipher.decrypt(cipherText3, test1.getKey());
        System.out.println("Noi dung quan lenh sau khi giai ma: " + originalMessage3);
        
        System.out.println();
        System.out.println("==================");   
        System.out.println();
        
        CeasarCipher test2 = new CeasarCipher("Chuc mung cac em da giai ma thanh cong."); 
        test2.setKey(13);
        String cipherText4 = test2.encrypt();
        System.out.println("Cac em hay giai ma doan mat ma sau (hint: con so may man cua truong FPT ): " + cipherText4);
        String originalMessage4 = CeasarCipher.decrypt(cipherText4, test2.getKey());
        System.out.println("Noi dung quan lenh sau khi giai ma: " + originalMessage4);
    }
}
