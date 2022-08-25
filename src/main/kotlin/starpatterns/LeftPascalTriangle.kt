package starpatterns

/*
output :- row =5
       *
      **
     ***
    ****
   *****
    ****
     ***
      **
       *

*/
fun main() {
    val row = 5
    var reverseCount = 0
    var reverse = 0
    for (i in 0 until row * 2 - 1) {
        for (j in 0 until row) {
            if (reverse <= 0) {
                if (j >= row - 1 - i) {
                    print("* ")
                } else {
                    print("  ")
                }
            } else {
                if (j > i - reverseCount) {
                    print("* ")
                } else {
                    print("  ")
                }
            }

        }


        if (i == row-1) {
            reverse++
            reverseCount = row
        }
        println()
    }
}