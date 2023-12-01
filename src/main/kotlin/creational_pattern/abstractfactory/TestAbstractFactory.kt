package creational_pattern.abstractfactory

fun main() {
    val factory: IServiceStackAbstractFactory? = ServiceStackAbstractFactory.createServiceFactory()
    val employeeService = factory?.getEmployeeService()
    val productService = factory?.getProductsService()
    println("EmployeeService class > " + employeeService?.javaClass?.canonicalName)
    println("ProductService class > " + productService?.javaClass?.canonicalName)
    println("employees > " + employeeService?.fetchAll())
    println("products > " + productService?.fetchAll())
}