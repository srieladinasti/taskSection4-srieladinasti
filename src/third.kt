fun main() {
    var number: Int = 12
    number +=2
    println(number)
    number -=10
    println(number)
    number *=9
    println(number)
    number /=4
    println(number)

    val righShift = number shr 3
    println(number)
    number +=1
    println(number)
    number *=2
    println(number)

    val leftShift = number shl 4
    println(number)
}