open class Polygone(private val lines: Array<Line>) : Line(Point(2.0, 1.0), Point(5.0, 1.0)) {
    override fun getInfo() {
        println("Polygone:")
        for (i in lines.indices) {
            lines[i].getInfo()
        }
    }

    fun moveOX(distance: Double) {
        for (i in lines.indices) {
            val startPoint = lines[i].startPoint
            val endPoint = lines[i].endPoint
            startPoint.x += distance
            endPoint.x += distance
        }
    }

    fun moveOY(distance: Double) {
        for (i in lines.indices) {
            val startPoint = lines[i].startPoint
            val endPoint = lines[i].endPoint
            startPoint.y += distance
            endPoint.y += distance
        }
    }

    fun move(distanceX: Double, distanceY: Double) {
        for (i in lines.indices) {
            val startPoint = lines[i].startPoint
            val endPoint = lines[i].endPoint
            startPoint.x += distanceX
            startPoint.y += distanceY
            endPoint.x += distanceX
            endPoint.y += distanceY
        }
    }
}