fun main(){
  var fullname = findfullname("Ahimbisibwe ", "Minage")
    sumofages()
    Average()
    interesting()
    add(24,60)
}

fun findfullname(firstName : String,lastName : String){
    var fullname = firstName +"" + lastName
    println(fullname)
}

fun sumofages():Int{
    var a =34
    var b=60
    var sum =a+b
    return(sum)
    }
fun Average() {
    var sum = sumofages()
    var avg = sum / 2
    println(avg)
}
    //invoke the function that calls the most interesting thing
fun interesting(){
    var interestng ="I LOVE MYSELF"
        println(interestng)
}

        // invoke the function
fun add(d: Int, c: Int){
    var sum= d+c
    println(sum)}







