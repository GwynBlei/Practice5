open class ColoredPoint (x: Double, y: Double, private var color: String) : Point(x, y) {
    fun setColor(color: String) {
        this.color = color
    }
    fun getColor(): String {
        return color
    }
    override fun getInfo() {
        println("Colored Point: x = $x , y = $y , color = $color")
    }
}
