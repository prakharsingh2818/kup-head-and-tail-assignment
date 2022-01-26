package edu.knoldus

class InsertionSort {
  def sort(list: List[Int]): List[Int] = {
    if (list.isEmpty) throw new Exception("Empty List: Nothing to sort")
    else insertionSort(list)
  }

  private def insertionSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) Nil
    else insert(list.head, insertionSort(list.tail))
  }

  private def insert(element: Int, sortedList: List[Int]): List[Int] = {
    if (sortedList.isEmpty || sortedList.head > element) element :: sortedList
    else sortedList.head :: insert(element, sortedList.tail)
  }
}
