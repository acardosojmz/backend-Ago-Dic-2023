package structural_pattern.flyweight

class PlayItemFactory {
    companion object {
        private const val ENABLE_FLY_WEIGHT = true
        private val playItems  = hashMapOf<String,PlayItem>()
        private var idSequence = 0L

        fun createPlayItems(songName: String): PlayItem? {
            return if(ENABLE_FLY_WEIGHT && playItems.containsKey(songName.uppercase() )) {
                playItems[songName]
            } else {
                val playItem = PlayItem(++idSequence, songName.uppercase())
                playItems[songName.uppercase()] = playItem
                playItem
            }
        }
    }
}