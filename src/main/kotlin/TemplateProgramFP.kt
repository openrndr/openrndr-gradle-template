import org.openrndr.application
import org.openrndr.color.ColorRGBa
import kotlin.random.Random

fun main() = application {
    configure {
        title = "OPENRNDR FP"
    }

    program {
        val r = 40.0

        extend {
            drawer.fill = ColorRGBa.PINK
            drawer.circle(Random.nextDouble(0.0, width * 1.0), Random.nextDouble(0.0, height * 1.0), r)
        }
    }
}