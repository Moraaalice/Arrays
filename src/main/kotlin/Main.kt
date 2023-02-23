fun main(){
    namesArray("Alice" ,"Joy","Jeff","Jemima")
    details()
}
fun namesArray(names:String, naming: String, name: String,nam:String){
    var names = arrayOf("String")
    println(names.contentToString())

}
fun details(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    var city = cities.map { it.capitalize() }

}
fun Int(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var number =  numbers[4]+numbers[43]
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun students(name1:String,name2:String,name3:String):Array<String>{
    return arrayOf(name1,name2,name3)


}