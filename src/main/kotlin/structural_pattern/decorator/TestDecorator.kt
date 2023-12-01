package structural_pattern.decorator

fun main(){
    val user = User("acardosojmz","234567890ABCDEFG")
    val customerMessage = CustomerMessage(
        "Ambrosio Cardoso Jimenez", "cardosojmz@gmail.com", "9513618396")

    println("Original Message ==> ${customerMessage} ")

    val  message =  RestDecorate(customerMessage)
    println("\n " + message.processMessage().content)

    val message1 = EncryptMessage(
        user,
        SOAPEnvelopMessage(
            XMLFormatterDecorate(customerMessage)
        )
    ).processMessage().content
    println(
        "message1 =====================================>\n"
                + message1 + "\n\n"
    )

    val message2 = SOAPHeaderDecorator(SOAPEnvelopMessage(
        EncryptMessage(
            user,
            XMLFormatterDecorate(customerMessage)
        )
    ), user ).processMessage().content
    println(
        ("message2 =====================================>\n"
                + message2)
    )
}