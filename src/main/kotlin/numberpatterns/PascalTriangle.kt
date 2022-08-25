package numberpatterns

import org.omg.CORBA.Object

fun main() {
    val n = 4
    var coef = 1

    for (i in 0 until n * 2 - 1) {
        var number = 1
        for (j in 0 until i) {
            if (((i + j) == (n * 2 - 1) / 2) || ((i + j) == ((n * 2 - 1) / 2) + (i * 2)) || ((i + j) > (((n * 2) - 1) / 2) && (i + j) < (((n * 2) - 1) / 2) + (i * 2))) {

                if (j == 0 || i == 0)
                    coef = 1
                else
                    coef = coef * (i - j + 1) / j

                System.out.printf("%4d", coef)

            } else {
                print("  ")
            }
        }
        println()
    }
}

