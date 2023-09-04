package com.example.kotlin_funamentals


// Create an object:

class Person1(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName : String = firstName

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    fun stateHobby(){
        println("${this.myFirstName}'s Hobby is: $hobby'" )
    }
}

//// Having multiple overloads:
//class Person2(var firstName: String, var lastName: String) {
//    var age: Int? = null
//    var eyeColor: String? = null
//
//    // Secondary Constructor
//    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
//        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
//    }
//
//    // Secondary Constructor
//    constructor(firstName: String, lastName: String, age: Int, eyeColor: String):
//            this(firstName, lastName, age)  {
//        this.eyeColor = eyeColor
//    }
//}


fun main(){
//    val john = Person1()
//    val johnPeterson = Person2(lastname: "Peterson")
    // You can use primary or secondary Constructor to create an object

    // Calls the primary constructor (Age will be null in this case)
    val person1 = Person1("Denis", "Panjuta")

    // Calls the secondary constructor
//    val person2 = Person2("Elon", "Musk", 48)
}