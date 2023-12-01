package structural_pattern.decoratorv2

fun main(){
    val pine =  PineChristmasTree()
    val christmasTree = BubbleLights(pine)
    val decoratedChristmasTree = Sphere(christmasTree)

    val decorated = Star(BubbleLights( Sphere(PineChristmasTree())))

    println(decoratedChristmasTree.decorate())
    println(decorated.decorate())
}