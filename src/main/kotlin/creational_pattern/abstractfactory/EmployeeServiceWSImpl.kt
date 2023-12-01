package creational_pattern.abstractfactory

class EmployeeServiceWSImpl: IEmployeeService {
    private val employees = listOf("SOA-Maria", "SOA-Rosalia", "SOA-Liliana")
    override fun fetchAll(): List<String> {
        return this.employees
    }
}