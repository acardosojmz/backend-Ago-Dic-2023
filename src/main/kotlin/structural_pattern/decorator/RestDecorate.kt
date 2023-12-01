package structural_pattern.decorator

import org.json.JSONObject

class RestDecorate(message:IMessage): MessageDecorator(message) {
    override fun processMessage(): IMessage {
        message = message.processMessage()
        message = jsonMessage()
        return message
    }
    private fun jsonMessage(): IMessage {
        val json = JSONObject(message)
        return  TextMessage(json.toString())
    }
}