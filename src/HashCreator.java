import java.nio.charset.StandardCharsets;
import com.google.common.hash.Hashing;

public class HashCreator {

    public static String calculateHash (String previousHash, String transaction, long nonce){
        final String calculatedHash = previousHash + transaction + nonce;
        return Hashing.sha256().hashString(calculatedHash, StandardCharsets.UTF_8).toString();
    }

}
