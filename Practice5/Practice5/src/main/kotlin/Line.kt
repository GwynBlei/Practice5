open class Line(var startPoint: Point, var endPoint: Point) {
      fun setStartPoint(x: Double, y: Double) {
          startPoint = Point(x , y)
      }
    fun setEndPoint(x: Double, y: Double) {
        endPoint = Point(x, y)
        }
    open fun getInfo() {
        println("Line: start point = (${startPoint.x}, ${startPoint.y}), end point = (${endPoint.x}, ${endPoint.y})")
        }
    }
