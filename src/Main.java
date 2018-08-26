import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> blockChains = new ArrayList<>();

    public static void main(String[] args) {

        String[] genesisTransactions = {"i sent 10000 rs to dad", "Balance amount 15000 "};
        Block genesisBlock = new Block(0, genesisTransactions);
        blockChains.add(genesisBlock.getBlockHash());

        String[] block1Transactions = {"dad withdrawn 5000 from ATM", "Balance Amount 5000"};
        Block block1 = new Block(genesisBlock.getBlockHash(), block1Transactions);
        blockChains.add(block1.getBlockHash());

        String[] block2Transactions = {"mom withdrawn 5000 from ATM", "Balance Amount 0"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        blockChains.add(block2.getBlockHash());

        String[] block3Transactions = {"I sent 10000 rs to mom", "Balance Amount 5000"};
        Block block3 = new Block(genesisBlock.getBlockHash(), block3Transactions);
        blockChains.add(block3.getBlockHash());

        String[] block4Transactions = {"mom withdrawn 1000 from ATM", "Balance Amount 9000"};
        Block block4 = new Block(genesisBlock.getBlockHash(), block4Transactions);
        blockChains.add(block4.getBlockHash());

        System.out.println(blockChains);
    }
}
