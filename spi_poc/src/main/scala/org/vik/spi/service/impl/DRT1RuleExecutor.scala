package org.vik.spi.service.impl

import org.vik.spi.service.RuleExecutorTrait

class DRT1RuleExecutor extends RuleExecutorTrait {

  override def execute(inputDF: Map[String, String]): Map[String, String] = {
    (inputDF + ("DRT1" -> "DRT1"))
  }

}
