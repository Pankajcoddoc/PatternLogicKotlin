package starpatterns

fun main() {

    val row = 4

    for (i in 0 until row) {

        for (j in 0 until row) {
            if (j>=i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }


}