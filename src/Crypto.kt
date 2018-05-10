
fun main (args: Array<String>) {
    val coin = Blockchain // coin = the Blockchain object

    println("How many blocks to generate?")
    val input: Int = readLine()!!.toInt()

    for (i in 1..input) {
        var j = i - 1
        var prevHash = "Block $j"
        val b = Block(i, "$prevHash", "Block $i") //previous hash should be the hash from the previous block
        coin.addNewBlock(b)
    }
    for (block in coin.chain) {
        println("""Data: ${block.data}
            |Previous hash: ${block.previousHash}
            |Current hash: ${block.hash}
            |""".trimMargin())
    }
}