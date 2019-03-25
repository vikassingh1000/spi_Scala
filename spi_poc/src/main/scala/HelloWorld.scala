import java.util.ServiceLoader

import org.vik.spi.service.RuleExecutorTrait
import org.vik.spi.service.impl.DRT1RuleExecutor

object HelloWorld {

  /**
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val drt1E: DRT1RuleExecutor = new DRT1RuleExecutor
    var map = Map("E1" -> "E2")
    val ruleExecutorServiceLoader: ServiceLoader[RuleExecutorTrait] = ServiceLoader.load(classOf[RuleExecutorTrait])

    ruleExecutorServiceLoader.iterator.forEachRemaining((rule: RuleExecutorTrait) => {
      map = rule.execute(map)
      println(rule.getClass)
    })

    map.foreach(i => println(i._1 + "=" + i._2))
  }
}