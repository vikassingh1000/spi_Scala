package org.vik.spi.service

trait RuleExecutorTrait {
  def execute(inputDF: Map[String, String]): Map[String, String]
}
