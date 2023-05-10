
package aes;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;
import java.util.Date;

public class AES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  try {
          
        long startTime = System.nanoTime();

           
            AES_ENCRYPTION aes_encryption = new AES_ENCRYPTION();
            aes_encryption.init();
            String encryptedData = aes_encryption.encrypt("Hello, welcome to the encryption world");
            String decryptedData = aes_encryption.decrypt(encryptedData);

            System.out.println("Encrypted Data : " + encryptedData);
            System.out.println("Decrypted Data : " + decryptedData);
            
            long endTime = System.nanoTime();
            
//System.out.println("the encryption was Took "+(endTime - startTime) + " ns");
        } catch (Exception ignored) {
        }
    }
    
}
