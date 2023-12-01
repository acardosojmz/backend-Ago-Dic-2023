package creational_pattern.prototype

data class ProductItem(var product: Product):
    IPrototype<ProductItem> {
    override fun clone(): Any {
        return ProductItem(product)
    }
    override fun deepClone(): ProductItem {
        return (this.clone() as ProductItem)
    }
}