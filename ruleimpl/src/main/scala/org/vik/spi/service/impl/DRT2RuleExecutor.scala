package org.vik.spi.service.impl

import org.vik.spi.service.RuleExecutorTrait

class DRT2RuleExecutor extends RuleExecutorTrait {

  override def execute(inputDF: Map[String, String]): Map[String, String] = {
    (inputDF + ("DRT2" -> "DRT2"))
  }

}
