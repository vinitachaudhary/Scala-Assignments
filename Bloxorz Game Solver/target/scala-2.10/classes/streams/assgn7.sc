package streams

import common._


/**
 * A main object that can be used to execute the Bloxorz solver
 */
/*object Bloxorz1 extends App {

  /**
   * A level constructed using the `InfiniteTerrain` trait which defines
   * the terrain to be valid at every position.
   */
  object InfiniteLevel1 extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(5,8)
  }
  
  println(InfiniteLevel1.solution)

  /**
   * A simple level constructed using the StringParserTerrain
   */
  abstract class Level extends Solver with StringParserTerrain
  
  object Level0 extends Level {
    val level =
      """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin
  }

  println(Level0.solution)

  /**
   * Level 1 of the official Bloxorz game
   */
  object Level1 extends Level {
    val level =
      """ooo-------
        |oSoooo----
        |ooooooooo-
        |-ooooooooo
        |-----ooToo
        |------ooo-""".stripMargin
  }

  println(Level1.solution)
}*/