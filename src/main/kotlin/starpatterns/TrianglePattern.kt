package starpatterns

fun main() {
    val n = 4
    for (i in 0 until n) {

        for (j in 0 until n * 2 - 1) {
            if (((i<n-1)&&(i + j) == (n * 2 - 1) / 2) || ((i<n-1)&&(i + j) == ((n * 2 - 1) / 2) + 2 * i) || (i == n - 1)) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}