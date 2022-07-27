package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


@DisplayName("Given an explosion")
class ExplosionTest {
  private val explosion = Explosion(explosionPoint = Point2D(2.0, 3.0), explosionRadius = 5.0, ticksLeft = 12)

  @Test
  fun `it has a type Explosion `() {
    assertEquals("Explosion", explosion.type)
  }

  @Test
  fun `it has a symbol asterisk `() {
    assertEquals('*', explosion.symbol)
  }

  @Test
  fun `it shows the type Explosion when converted to String `() {
    assertTrue(explosion.toString().contains("Explosion"))
  }

  @Test
  fun `it starts with ticks left equals 12`() {
    assertEquals(explosion.ticksLeft, 12)
  }

  @Test
  fun `it has its ticks left updated when a tick happens`() {
    explosion.decreaseTicks()
    assertEquals(explosion.ticksLeft, 11)
  }


}