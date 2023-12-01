package creational_pattern.singleton


fun main (){
    var singletonA: Singleton? = Singleton.getInstance()

    var singletonB: Singleton? = Singleton.getInstance()

    println(singletonA)

    println(singletonB)

    println("Misma referencia ==> " + (singletonA === singletonB))

    singletonA?.setAppName("Singleton Pattern")

    singletonB?.setAppVersion("Version modificada en B")


    println("App name B: " + singletonB!!.getAppName())

    println("Version de A: " + singletonA!!.getAppVersion())

    println("SingletonA ==> $singletonA")

    println("SingletonB ==> $singletonB")

    singletonA = null

    singletonB = null

    singletonA = Singleton.getInstance()

    println("SingletonA ==> $singletonA")
}