package starpatterns

/*

    * * * * * * * * *
      *           *
        *       *
          *   *
            *

*/



fun main(){

    val n=5
    for(i in n-1 downTo 0){

        for(j in 0 until n*2-1){

            if(i==n-1||((i + j) == (n * 2 - 1) / 2) || ((i<n-1)&&(i + j) == ((n * 2 - 1) / 2) + 2 * i) ){
                print("* ")

            }else{
                print("  ")
            }
        }
        println()

    }
}