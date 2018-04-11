package exercise

abstract class SemiGroup[A] {
  def add(x:A, y:A): A
}

abstract class Monoid[A] extends SemiGroup[A] {
  def unit:A
}

