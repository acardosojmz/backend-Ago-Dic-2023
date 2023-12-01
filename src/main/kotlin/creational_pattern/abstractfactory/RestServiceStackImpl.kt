package creational_pattern.abstractfactory

class RestServiceStackImpl: IServiceStackAbstractFactory {
    override fun getProductsService(): IProductService = ProductServiceRestImpl()

    override fun getEmployeeService(): IEmployeeService = EmployeeServiceRestImpl()
}