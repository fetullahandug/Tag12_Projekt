
fun main(){
    println(initialisePersons())
}

fun doppelterWert(): Int{
    var value: Int = 12
    var returnValue = value * 3
    return returnValue
    //Diese Funktion gibt 36 zurück
}

fun videothek(): String{
    var list: MutableList<String> = mutableListOf("Star Wars", "Shrek", "Toy Story")
    println("Hallo Gast, das sind unsere verfügbaren Filme: $list")
    println("Gebe einen Index ein:")
    val eingabe: Int  = readln().toInt()
    return list[eingabe]
}

fun initialisePersons(){
    var persons: MutableMap<String, Int> = mutableMapOf()
    println("Gebe die erste Person ein Schreibweise: Name, Alter")
    println("Person: ")
    var eingabe: String = readln()
    var eingabeSplitted = eingabe.split(',')
    persons.put(eingabeSplitted[0], eingabeSplitted[1].toInt())
    println("Gebe die zweite Person ein Schreibweise: Name,Alter")
    println("Person: ")
    eingabe = readln()
    eingabeSplitted = eingabe.split(',')
    persons.put(eingabeSplitted[0], eingabeSplitted[1].toInt())
    println("Gebe die dritte Person ein Schreibweise: Name, Alter")
    println("Person: ")
    eingabe = readln()
    eingabeSplitted = eingabe.split(',')
    persons.put(eingabeSplitted[0], eingabeSplitted[1].toInt())

    println("\nPersonenliste:\n$persons")

    var indexOfYoungest: Int = persons.values.indexOf(persons.values.min())
    var indexOfOldest: Int = persons.values.indexOf(persons.values.max())

    var temporaryList = persons.toList()

    println("\nDie jüngste Person ist: ${temporaryList[indexOfYoungest]}")
    println("Die älteste Person ist: ${temporaryList[indexOfOldest]}")

    val avg_age: Double = persons.values.average()
    val sum_age: Int = persons.values.sum()

    println("\nDas durchschnittliche Alter aller Personen ist: $avg_age}")
    println("\nDie Summe der Alter aller Personen ist: $sum_age}")
    println("\nListe: \n" + persons)
}

fun wuerfelWurf(): Int{
    return (1..6).random()
}


Hallo Welt Abdul Fetullah


