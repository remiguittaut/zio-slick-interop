package slick.interop.tests

import zio.IO

object ItemRepository {

  trait Service {

    def add(name: String): IO[Throwable, Long]
    def getById(id: Long): IO[Throwable, Option[Item]]
  }
}
