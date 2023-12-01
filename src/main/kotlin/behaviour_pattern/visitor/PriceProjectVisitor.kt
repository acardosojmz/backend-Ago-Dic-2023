package behaviour_pattern.visitor


class PriceProjectVisitor : IVisitor<Number?> {
    private var totalPrice = 0.0
    override fun project(project: Project) {
        project.getActivities()!!.forEach{ it.accept(this)}
    }

    override fun activity(activity: Activity) {
        totalPrice += activity.getPrice()
        activity.getActivities().forEach{it.accept(this)}
    }

    override fun employee(employee: Employee) {
        TODO("Not yet implemented")
    }


    override fun getResult(): Number {
        return totalPrice
    }
}