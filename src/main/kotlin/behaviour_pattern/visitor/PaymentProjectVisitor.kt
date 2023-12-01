package behaviour_pattern.visitor


class PaymentProjectVisitor : IVisitor<List<EmployeePay>> {

    private val employeePayment: MutableMap<String?, Number> = HashMap()

    override fun project(project: Project) {
        project.getActivities()!!.forEach{it.accept(this)}
    }

    override fun activity(activity: Activity) {
        activity.getResponsible()!!.accept(this )
        activity.getActivities().forEach{it.accept(this)}
    }

    override fun employee(employee: Employee) {
        val resp = employee.name
        if (employeePayment.containsKey(resp)) {
            employeePayment[resp] = (
                    employeePayment[resp]!!.toDouble()
                            + employee.price)
        } else {
            employeePayment[resp] = employee.price
        }
    }

    override fun getResult(): List<EmployeePay> {
        val response: MutableList<EmployeePay> = ArrayList<EmployeePay>()
        val keys: Set<String?> = employeePayment.keys
        for (key in keys) {
            response.add(
                EmployeePay( key,
                    employeePayment[key]!!.toDouble()
                )
            )
        }
        return response
    }
}

