package structural_pattern.decorator


class SOAPHeaderDecorator(message:IMessage,
                          private val user: User): MessageDecorator(message) {
    override fun processMessage(): IMessage {
        message = message.processMessage()
        message = includeHeader()
        return message
    }
    private fun includeHeader(): IMessage {
        val header ="<soapenv:Header>" +
                "user: " + user.account + "\n" +
                "password: " + user.password +
                "</soapenv:Header>"
        val content =   message.content.replace("<soapenv:Header/>",header)
        return  TextMessage(content)
    }
}