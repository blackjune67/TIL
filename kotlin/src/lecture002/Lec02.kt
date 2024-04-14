package lecture002

class Lec02 {
    fun main() {
        val str: String? = "ABC"
        println(str?.length)
    }

    /**
     *  * if문을 사용하지 않고 safe call과 Elvis 연산자를 사용해서 코틀린스럽게 변환했다
     *  */
    fun startsWithA1(str: String?): Boolean {
        /* ! before */
        if(str == null) {
            throw IllegalArgumentException("null이 들어왔습니다")
        }
        return str.startsWith("A");

        // * after
        str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
    }

    fun startsWithA2(str: String) : Boolean? {
        /*if (str == null) {
            return null
        }
        return str.startsWith("A")*/

        return str?.startsWith("A")
    }

    fun startsWithA3(str: String?) : Boolean {
        /*if (str == null) {
            return false;
        }
        return str.startsWith("A")*/

        return str?.startsWith("A") ?: false
    }

    fun startsWith(str: String?): Boolean {
        // * 확실하게 null이 안들어올 떄
        return str!!.startsWith("A")
    }
}

