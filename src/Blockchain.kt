object Blockchain {
    val chain = mutableListOf<Block>() // array of Blocks are created
    val latestBlock: Block
        get() = chain.last()

    init {
        chain.add(Block(0, "0", "Genesis block")) // creates a genseis block that is hardcoded at index 0
    }

    fun addNewBlock(block: Block) {
        if (isNewBlockValid(block))
            chain.add(block)
        //if the new block is valid, add it to the chain (array)
    }

    private fun isNewBlockValid(newBlock: Block): Boolean = ((newBlock.index == latestBlock.index + 1) || (newBlock.previousHash == latestBlock.hash))




}