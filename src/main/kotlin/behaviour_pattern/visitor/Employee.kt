package behaviour_pattern.visitor

import jakarta.xml.bind.annotation.XmlAccessType
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.XmlAttribute
import jakarta.xml.bind.annotation.XmlRootElement
import java.util.*


@XmlRootElement(name = "Responsible")
@XmlAccessorType(XmlAccessType.FIELD)
class Employee: IVisitable{
    @XmlAttribute(name = "name")
    var name: String

    @XmlAttribute(name = "price")
    var price: Double

    constructor(){}
    constructor(name: String, price: Double){
        this.name = name
        this.price = price
    }
    init {
        this.name=""
        this.price=0.0
    }
    override fun accept(visitor: IVisitor<*>) {
        visitor.employee(this)
    }
    override fun hashCode(): Int {
        var hash = 7
        hash = 37 * hash + Objects.hashCode(name)
        return hash
    }

    override fun equals(obj: Any?): Boolean {
        if (obj == null) {
            return false
        }
        if (javaClass != obj.javaClass) {
            return false
        }
        val other = obj as Employee
        return name == other.name
    }
}

