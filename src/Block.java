import java.util.Arrays;

public class Block {
    private int previousHash;
    private int blockHash;

    Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        Object[] objects = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(objects);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }
}
