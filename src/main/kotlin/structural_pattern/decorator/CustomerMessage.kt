package structural_pattern.decorator


class CustomerMessage(private val name: String,
                      private val email: String,
                      private val telephone: String) : IMessage {
    override fun processMessage(): IMessage {
        return this
    }

    override var content: String
        get() = toString()
        set(content) {
            throw UnsupportedOperationException("Not supported yet.")
        }

    override fun toString(): String {
        return ("QueryCustomerMessage {" + "name=" + name + ", email="
                + email + ", telephone=" + telephone + '}')
    }
}