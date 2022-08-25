/*
when n=5
        *
       **
      ***
     ****
    *****
*/
fun main() {
    val n = 5
    for (i in 0 until n) {
        for (j in 0 until n) {
            if ((i + j) >= n - 1)
                print("*")
            else
                print("&")
        }
        println()
    }
}