package com.lmat.adventofcode.year2018

import com.lmat.adventofcode.PuzzleRunner.{puzzleMap, resource}
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class Year2018Test extends FunSuite with TableDrivenPropertyChecks {

  val puzzles =
    Table(
      ("day", "part1", "part2"),
      (1,     540,     73056),
      (2,     5658,    "nmgyjkpruszlbaqwficavxneo")
    )

  forAll(puzzles) { (day, part1, part2) =>
    val year = 2018

    test(s"$year: Day $day") {
      val (res1, res2) = puzzleMap(year, day).solve(resource(year, day))
      assert(res1 == part1)
      assert(res2 == part2)
    }
  }
}
