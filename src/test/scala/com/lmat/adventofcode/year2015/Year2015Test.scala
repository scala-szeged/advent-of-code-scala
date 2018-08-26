package com.lmat.adventofcode.year2015

import com.lmat.adventofcode.PuzzleRunner.{puzzleMap, resource}
import org.scalatest.FunSuite
import org.scalatest.prop.TableDrivenPropertyChecks

class Year2015Test extends FunSuite with TableDrivenPropertyChecks {

  val puzzles =
    Table(
      ("day", "part1", "part2"),
      (1,     232,     1783),
      (2,     1586300, 3737498),
      (3,     2572,    2631),
      (4,     117946,  3938038),
      (5,     255,     55),
      (6,     569999,  17836115),
      (7,     16076,   2797),
      (8,     1350,    2085),
      (9,     141,     736)
    )

  forAll(puzzles) { (day, part1, part2) =>
    val year = 2015

    test(s"$year: Day $day") {
      val (res1, res2) = puzzleMap(year, day).solve(resource(year, day))
      assert(res1 == part1)
      assert(res2 == part2)
    }
  }
}
