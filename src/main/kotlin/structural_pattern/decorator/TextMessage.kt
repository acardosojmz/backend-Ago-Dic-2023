package structural_pattern.decorator


class TextMessage ( override var content: String): IMessage {
    override fun processMessage(): IMessage {
        return this
    }
}
