package structural_pattern.bridge


fun main(){
    val aesImpl:IMessageEncrypt = MessageEncryptImpl(
        AESEncryptAlgorithm())
    val desImpl:IMessageEncrypt = MessageEncryptImpl(
        DESEncryptAlgorithm())
    val noImpl: IMessageEncrypt = MessageEncryptImpl(
        NoEncryptAlgorithm())
    try {
        val message = "{\"fullname\":\"Ambrosio Cardoso Jimenez\",\"age\":48}"
        val messageAES = aesImpl.encryptMessage(message, "AG58YZ3CR9123456AG58YZ3R9123456")
        println("messageAES > $messageAES\n")
        val  messageDES = desImpl.encryptMessage(message, "XMzDdG4D03CKm2Ix")
        println("messageDES > $messageDES\n")
        val messageNO = noImpl.encryptMessage(message, "")
        println("messageNO > $messageNO\n")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}