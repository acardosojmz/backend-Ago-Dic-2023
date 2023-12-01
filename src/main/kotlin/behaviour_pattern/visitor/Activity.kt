package behaviour_pattern.visitor


import jakarta.xml.bind.annotation.*


@XmlRootElement(name = "Activitie")
@XmlAccessorType(XmlAccessType.FIELD)
class Activity: IVisitable {
    @XmlAttribute(name = "name")
    private var name: String? = null

    @XmlAttribute(name = "price")
    private var price = 0.0

    @XmlElement(name = "responsible")
    private var responsible: Employee? = null

    @XmlElement(name = "Activities")
    private var activities: MutableList<Activity>? = null

    constructor()
    constructor(name: String?, price: Double, responsible: Employee?) {
        this.name = name
        this.price = price
        this.responsible = responsible
    }

    fun getActivities(): List<Activity> {
        if (activities == null) {
            activities = ArrayList()
        }
        return activities!!
    }

    fun setActivities(activities: MutableList<Activity>?) {
        this.activities = activities
    }

    fun addActivity(activity: Activity) {
        if (activities == null) {
            activities = ArrayList()
        }
        this.activities!!.add(activity)
    }

    fun removeActivity(activity: Activity) {
        if (activities == null) {
            activities = ArrayList()
        }
        activities!!.remove(activity)
    }

    override fun accept(visitor: IVisitor<*>) {
        visitor.activity(this)
    }

    fun getPrice() = this.price
    fun setPrice (price: Double) {this.price =  price}

    fun getResponsible() = this.responsible
}




