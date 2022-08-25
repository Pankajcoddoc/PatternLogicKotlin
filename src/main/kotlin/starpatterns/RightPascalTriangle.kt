package starpatterns

/*
output :-  row =5
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

*/

fun main() {
    val row = 5
    var reverseOrder = 0
    var reverseCount = 0

    for (i in 0 until row * 2 - 1) {

        for (j in 0 until row) {


            if (reverseOrder <= 0) {

                if (i >= j)
                    print("* ")

            } else {

                if (reverseCount > j)
                    print("* ")

            }

        }
        println()
        if (i == row - 1) {
            reverseOrder = 1
            reverseCount = row
        }
        if (reverseOrder >= 0)
            reverseCount--
    }

}