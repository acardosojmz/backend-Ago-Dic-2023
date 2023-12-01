package structural_pattern.decoratorv2

class Star(tree: IChristmasTree) : TreeDecorator(tree) {

    override fun decorate(): String {
        return super.decorate() + decorateWithStar()
    }

    private fun decorateWithStar(): String {
        return " with star"
    }
}