package structural_pattern.decorator


abstract class MessageDecorator(protected var message: IMessage) : IMessage {

    override var content: String
        get() = message.content
        set(content) {
            message.content = content
        }
}