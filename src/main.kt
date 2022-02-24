
// concatenate the String
fun main(){
    val statement = "The owner of this"
    val item = "Book"
    val action = "will get it tomorrow"

    val sentence = statement+" "+item+" "+action
    println(sentence)


//    Char and String
    val fruits = "banana"
    val x = fruits[1].toString()+fruits[2]+fruits[3]//character with single cannot be concatenate only the string with double quote//
    println(fruits[0])
    println(fruits[1])
    println(fruits[2])
    println(fruits[3])
    println(fruits[4]) // the individual letters it a single line
    println(x)

    //Built in Function instead of concatenate Character with is not the right syntax for kotlin language
    var fruit ="banana"
    var f =fruit.first()// These are built in function character
    println(f)


     val Fruits = "Mango"
    val y = Fruits[0].toString()+Fruits[1]
    println(y)





}