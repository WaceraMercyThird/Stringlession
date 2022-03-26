fun main() {
    employeeAvgNo()
    builtIn()
}
// the total numberof employees for both google and amazon company
fun employeeTotalNo(google:Int, amazon:Int):Int{
    var totalNumber = google + amazon
    return totalNumber
}
// the average number of employee from the total of two companies
fun employeeAvgNo(){
   var totalNumber = employeeTotalNo(27800000, 890000000)
    var average =totalNumber/2
    println(average)
}
fun builtIn(){
    var names = "mangos"
    println("name"+" "+names[0].toString())

}


