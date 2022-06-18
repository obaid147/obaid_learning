import scala.annotation.tailrec

object FactSeq{

  def factSeq(n: Int): List[Long] = {
    factSeqInner(n, List(1L), 2)
  }

  @tailrec
  private def factSeqInner(n: Int, acc: List[Long], ct: Int): List[Long] = {
    if (ct > n)
      acc
    else
      factSeqInner(n, ct * acc.head :: acc, ct + 1)
  }
}

FactSeq.factSeq(4)