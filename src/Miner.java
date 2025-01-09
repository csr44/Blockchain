public class Miner {
    private int difficulty;
    private String target;

    public Miner(int difficulty, String targer) {
        this.difficulty = difficulty;
        this.target = new String(new char[targer.length()]).replace('\0', '0');
    }

    Block mineBlock(String previousHash, String transaction){
        System.out.println("Mining block ... ");
        long nonce = 0;
        String hash = HashCreator.calculateHash(previousHash,transaction,nonce);
        while(!hash.substring(0, difficulty).equals(target)){
            nonce++;
            hash = HashCreator.calculateHash(previousHash,transaction,nonce);
        }
        System.out.println("Block was mined successfully at " + nonce + "attempt." + "Hash: " + hash);
        System.out.println();

        return new Block(transaction, previousHash, hash,nonce);
    }
}
