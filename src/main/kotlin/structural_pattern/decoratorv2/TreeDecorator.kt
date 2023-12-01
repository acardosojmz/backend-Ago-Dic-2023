package structural_pattern.decoratorv2

abstract class TreeDecorator
    (private val tree: IChristmasTree) : IChristmasTree {

    override fun decorate(): String {
        return tree.decorate()
    }
}