package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  explosionPoint:Point2D,
  explosionRadius: Double
) :
  SpaceObject("Explosion", '*', explosionPoint, Vector2D(0.0, 0.0), explosionRadius, 0.0) {
}
