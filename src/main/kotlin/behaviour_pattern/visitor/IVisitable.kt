package behaviour_pattern.visitor

interface IVisitable {
    fun accept( visitor: IVisitor<*>)
}