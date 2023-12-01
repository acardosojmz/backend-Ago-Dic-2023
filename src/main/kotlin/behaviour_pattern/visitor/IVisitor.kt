package behaviour_pattern.visitor




interface  IVisitor <out T> {
    fun project(project: Project)
    fun activity(activity: Activity)
    fun employee(employee: Employee)
    fun getResult(): T
}
