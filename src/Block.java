public class Block {
    private String previousHash;
    private String hash;
    private String transaction;
    private long nonce;

    Block(String previousHash, String hash, String transaction, long nonce) {
        this.previousHash = previousHash;
        this.hash = hash;
        this.transaction = transaction;
        this.nonce = nonce;
    }

    public String getPreviousHash() {
        return previousHash;
    }
    public String getHash() {
        return hash;
    }
    public String getTransaction() {
        return transaction;
    }
    public long getNonce() {
        return nonce;
    }
}
