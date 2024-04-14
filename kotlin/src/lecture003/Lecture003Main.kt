package lecture003

import lecture001.Person

fun main() {
    val name = "최하준"
    val names = """
        ABC
        DFE
        ${name}
    """.trimIndent()
    println(names)
}

fun printAgIfPerson(obj: Any) {
    if (obj is Person) {
        var person = obj as Person
        println(person.age)
    }
}