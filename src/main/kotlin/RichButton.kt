// open 클래스 : 상속 가능
open class RichButton : Clickable {
    // 기본적으로 final method : 오버라이드 불가능
    fun disable() {}
    // open method : 오버라이드 가능
    open fun animate() {}
    // override method : 오버라이드 가능
    override fun click() = println("this is clickable")

}