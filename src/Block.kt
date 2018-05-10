import org.apache.commons.codec.digest.DigestUtils
import java.util.*

class Block (val index: Int, val previousHash: String, val data: Any) {

    val timestamp: Long = Date().time
    val hash = calculateHash() // hash = returned value of calculate hash

    fun calculateHash(): String { //returns string
        val input = (index.toString() + previousHash + timestamp + data).toByteArray()
        return DigestUtils.sha256Hex(input) // returns the input in sha256Hex conversion

    }
}

