import java.util.ArrayList;

public class Main {

    private static ArrayList<Block> blockChain = new ArrayList<>();
    private static int difficulty = 5;

    public static void main(String[] args) {
        Miner miner = new Miner(difficulty);

        //Create first transaction
        String transactionOne = "Peter pays Michael 5 C";
        //Miner starts mining based on transaction
        Block firstBlock = miner.mineBlock("0", transactionOne);
        //Add block to blockchain
        blockChain.add(firstBlock);

        //Create first transaction
        String transactionTwo = "Lucy pays Ronda 7 C";
        //Miner starts mining based on transaction
        Block secondBlock = miner.mineBlock(firstBlock.getHash(), transactionTwo);
        //Add block to blockchain
        blockChain.add(secondBlock);

        //Create first transaction
        String transactionThree = "Marta pays Jane 9 C";
        //Miner starts mining based on transaction
        Block thirdBlock = miner.mineBlock(secondBlock.getHash(), transactionThree);
        //Add block to blockchain
        blockChain.add(thirdBlock);
    }
}
