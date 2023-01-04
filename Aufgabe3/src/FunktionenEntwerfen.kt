
fun main() {
    println(returnMap())
}

fun return5(): Int{
    return 5
}

fun returnValue(): Double{
    return 6.234
}

fun returnString(): String{
    return "Hallo"
}

fun returnDouble(): MutableList<String>{
    var list: MutableList<String> = mutableListOf("Hallo","Welt")
    return list
}

fun returnMap(): MutableMap<String, Boolean>{
    var map: MutableMap<String, Boolean> = mutableMapOf(
        "Lernen wir die Sprache Französich" to false,
        "Lernen wir die Sprache Kotlin?" to true
    )

    return map
}
