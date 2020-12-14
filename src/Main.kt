fun main() {
    print("Uang Tabungan(Euro): ")
    var tabungan : Int = readLine()?.toInt()!!



    print("\nIngin beli PS5 (true/false)? ")
    val ps5 : Boolean = readLine()?.toBoolean()!!

    when (ps5){true ->{tabungan -= 499}}

    if(tabungan<0) {
        tabungan += 499
        println("\nUang tabungan tidak cukup untuk membeli PS5.")
        println("Perlu ${499-tabungan} Euro untuk membeli PS5.")
    }

    print("\nIngin beli iPhone 12 (true/false)? ")
    val iphone : Boolean = readLine()?.toBoolean()!!

    when(iphone){true->tabungan -= 1499}

    if(tabungan<0) {
        tabungan += 1499
        println("\nUang tabungan tidak cukup untuk membeli iPhone 12.")
        println("Perlu ${1499-tabungan} Euro untuk membeli iPhone 12.")
    }

    println("\nSisa tabungan: $tabungan")

}