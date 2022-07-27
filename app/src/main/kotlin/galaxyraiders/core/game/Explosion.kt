package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  explosionPoint: Point2D,
  explosionRadius: Double,
  var ticksLeft: Int
) :
  SpaceObject("Explosion", '*', explosionPoint, Vector2D(0.0, 0.0), explosionRadius, 0.0) {
  fun decreaseTicks() {
    this.ticksLeft = this.ticksLeft - 1
  }
}
