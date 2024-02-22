fun main(){
    printFullName("Hello", "Terry")
modulus(67, 63)
    add(3,4,5,6)
    printMe("brave")
}

fun printFullName(firstName: String, lastName: String) {
    var fullName = firstName + " " + lastName
    println(fullName)
}

fun modulus(num1: Int,num2: Int){
    var modulus = num1%num2
    println(modulus)

}
fun add(num3: Int,num4: Int,num5:Int,num6: Int){
    var sum = num3+num4+num5+num6
    print(sum)

}

fun printMe(me: String) {
    println("I am a" +" "+ me)
}
