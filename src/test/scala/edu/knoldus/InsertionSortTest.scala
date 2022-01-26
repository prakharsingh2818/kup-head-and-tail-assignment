package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class InsertionSortTest extends AnyFlatSpec {
  val sorter = new InsertionSort
  val unsortedList = List(23, 43, 11, 55, 33, 11)
  val emptyList = List()

  behavior of "sort"

  "sort" should "sort the list" in {
    assertResult(unsortedList.sortBy(element => element))(sorter.sort(unsortedList))
  }

  it should "throw an exception when called on an empty list" in {
    val expectedErrorMessage = "Empty List: Nothing to sort"
    val error = intercept[Exception] {
      sorter.sort(emptyList)
    }
    assertResult(error.getMessage)(expectedErrorMessage)
  }
}
