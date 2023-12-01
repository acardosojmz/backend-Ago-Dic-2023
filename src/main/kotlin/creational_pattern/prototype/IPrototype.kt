package creational_pattern.prototype

interface IPrototype<T> : Cloneable {
    public override fun clone(): Any
    fun deepClone(): T
}
