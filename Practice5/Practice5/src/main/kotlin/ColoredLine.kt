open class ColoredLine(startPoint: Point, endPoint: Point, private var color: String) : Line(startPoint, endPoint) {
    fun setColor(color: String) {
        this.color = color
    }

    fun getColor(): String {
        return color
    }

    override fun getInfo() {
        println("Colored Line: startPoint = (${startPoint.x}, ${startPoint.y}), end point = (${endPoint.x}, ${endPoint.y}), color = $color")
    }
}
