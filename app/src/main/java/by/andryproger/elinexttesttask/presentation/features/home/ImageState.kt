package by.andryproger.elinexttesttask.presentation.features.home

data class ImageState(
    val itemId: Long,
    val link: String?
) {

    companion object {
        private var lastId = 1L

        fun generateId() = lastId++
    }
}