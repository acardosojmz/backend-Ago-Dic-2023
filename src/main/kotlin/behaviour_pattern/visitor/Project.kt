package behaviour_pattern.visitor

import jakarta.xml.bind.annotation.*


@XmlRootElement(name = "Project")
@XmlAccessorType(XmlAccessType.FIELD)
class Project: IVisitable {
    @XmlAttribute(name = "name")
    var name: String

    @XmlElement(name = "Activities")
    private var activities: MutableList<Activity>? = null

    init {
        this.name=""
    }
    constructor()
    constructor(name: String) {
        this.name = name
    }

    fun getActivities(): List<Activity>? {
        if (activities == null) {
            activities = ArrayList<Activity>()
        }
        return activities
    }

    fun setActivities(activities: MutableList<Activity>?) {
        this.activities = activities
    }

    fun addActivity(activity: Activity) {
        if (activities == null) {
            activities = ArrayList<Activity>()
        }
        activities!!.add(activity)
    }

    override fun accept(visitor: IVisitor<*>) {
        visitor.project(this)
    }


}

