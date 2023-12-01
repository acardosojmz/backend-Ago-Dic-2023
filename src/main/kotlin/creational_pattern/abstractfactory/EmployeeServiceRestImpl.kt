package creational_pattern.abstractfactory

class EmployeeServiceRestImpl: IEmployeeService {
    //private val employees = listOf("REST-Juan Carlos", "REST-Moises", "REST-Sandra")
    override fun fetchAll(): List<String> {
        return ApiRestEmployees.fetchAll()
    }
}