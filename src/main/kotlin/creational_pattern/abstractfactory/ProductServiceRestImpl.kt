package creational_pattern.abstractfactory

class ProductServiceRestImpl: IProductService {
    //private val products = listOf("REST-Teclado", "REST-Mouse", "REST-Monitor")
    override fun fetchAll(): List<String> {
        return ApiRestProducts.fetchAll()
    }

}