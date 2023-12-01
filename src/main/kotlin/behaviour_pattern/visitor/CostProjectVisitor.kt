package behaviour_pattern.visitor


class CostProjectVisitor : IVisitor<Number> {
    private var totalCost = 0.0

    override fun project(project: Project) {
        project.getActivities()!!.forEach{ it.accept(this)}
    }

    override fun activity(activity: Activity) {
        activity.getResponsible()!!.accept(this)

        activity.getActivities().forEach{it.accept(this)}

    }


    override fun employee(employee: Employee) {
        totalCost += employee.price
    }

    override fun getResult(): Number {
        return totalCost
    }
}