fun main(args: Array<String>) {
    val n: Point = Point(2.0, 4.0)
    println("${n.getInfo()}")
    val b:ColoredPoint=ColoredPoint(3.0,2.0, "Red")
    println(b.getInfo())
    val m: Line = Line(Point(1.0, 1.0), Point(4.0, 4.0))
    println(m.getInfo())
    m.setStartPoint(2.0, 2.0)
    m.setEndPoint(5.0, 5.0)
    m.getInfo()
    val coloredLine = ColoredLine(Point(1.0, 1.0), Point(4.0, 4.0), "Green")
    coloredLine.getInfo()
    coloredLine.setColor("Yellow")
    println("Color: ${coloredLine.getColor()}")
    val polygone = Polygone(
        arrayOf(
            Line(Point(1.0, 1.0), Point(4.0, 4.0)),
            Line(Point(4.0, 4.0), Point(7.0, 7.0)),
            Line(Point(7.0, 7.0), Point(1.0, 1.0))
        )
    )
    polygone.getInfo()
    polygone.moveOX(3.0)
    polygone.getInfo()
    polygone.moveOY(2.0)
    polygone.getInfo()
    polygone.move(2.0, 1.0)
    polygone.getInfo()
}
