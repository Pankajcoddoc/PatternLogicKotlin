package starpatterns

/*
when n=5
    * * * * *
    * * * *
    * * *
    * *
    *
*/
fun main() {
    val n = 5
    for (i in 0 until n) {

        for (j in n-1 downTo i) {
            print("* ")

        }
        println()
    }

}