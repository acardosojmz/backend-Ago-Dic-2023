package structural_pattern.decorator


interface IMessage {
    fun processMessage(): IMessage
    var content: String
}