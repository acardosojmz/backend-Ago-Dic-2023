package structural_pattern.composite

abstract class AbstractProduct (
    val name: String,
    val tax: Double,
    private val price:Double,
    val quantity: Long) {
    open fun getPrice():Double { return price * quantity}
}