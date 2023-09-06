class NewChild(
    private val subName: String,
    familyName: String,
    private val age: Int
) : Parent(familyName) {
    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge(
            subName: String, familyName: String
        ): NewChild = NewChild(subName, familyName, 0)

        fun ofDefaultName(
            age: Int
        ): NewChild = NewChild(
            "defaultName",
            "defaultFamilyName",
            0
        )
    }
}