
fun main(){
    var pupil=Human("Tut",50,50)
    pupil.eat(60)
    println(pupil.weight)
    pupil.speak("Hello World")
    pupil.birthday()

    var person=User("Nyawera","Tuti","nyaweratut@gmail.com",706451669,"kotlin")
    println(person.firstName)
    println(person.email)





}
class Human(var name:String,var age:Int,var weight :Int) {
    fun eat(foodWeight: Int) {
        weight += foodWeight
        println("I am eating $foodWeight kg of foods")


    }

    fun speak(speech: String) {
        println(speech)

    }

    fun birthday() {
        println(age + 1)


    }
}
data class User(var firstName: String,var lastName:String,var email:String,var phoneNumber:Int,var password:String)



//Assignment 5: OOP
//1.Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//-speak(speech: String) :Prints the string passed toit
//points)
//-birthday( ) :Increments the human’s age by 1(2
//points)
//Create an instance of this human class and invoke all its functions
//2.Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes                                                                                                                (