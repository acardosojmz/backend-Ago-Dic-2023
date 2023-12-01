package structural_pattern.proxy

import java.text.SimpleDateFormat
import java.util.*

class AuditService {
    fun auditServiceUsed(user: String, service: String) {
        val formatter = SimpleDateFormat("dd/MM/YYYY hh:mm:ss")
        println(
            user + " utilizó el servicio > "
                    + service + ", a las " + formatter.format(Date())
        )
    }
}
