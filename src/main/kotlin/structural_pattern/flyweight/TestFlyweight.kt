package structural_pattern.flyweight

fun main() {

    val playListAbilene = PlayList("musica popular")
    playListAbilene.addPlayItem("La llorona")
    playListAbilene.addPlayItem("La martiniana")
    playListAbilene.addPlayItem("La llorona")
    playListAbilene.printList()
    playListAbilene.addPlayItem("La sandunga")
    playListAbilene.printList()

    val playListAntonio = PlayList("musica rock")
    playListAntonio.addPlayItem("La llorona")
    playListAntonio.addPlayItem("La plaga")
    playListAntonio.addPlayItem("rock is dead")
    playListAntonio.printList()
    playListAntonio.addPlayItem("La plaga")
    playListAntonio.printList()

}