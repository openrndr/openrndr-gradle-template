import org.openrndr.*
import org.openrndr.color.ColorRGBa
import org.openrndr.math.Vector2
import org.openrndr.shape.contour

class TemplateProgram: Program() {
    override fun draw() {
        drawer.background(ColorRGBa.BLACK)
        drawer.fill = null
        drawer.stroke = ColorRGBa.WHITE

        val c = contour {
            moveTo(Vector2(10.0, 10.0))
            lineTo(cursor + Vector2(400.0, 400.0))
            lineTo(cursor - Vector2(-100.0, 100.0))
            lineTo(anchor)
        }
        drawer.contour(c)
    }
}

fun main(args: Array<String>) {
    application(TemplateProgram(),
            configuration {

            })
}