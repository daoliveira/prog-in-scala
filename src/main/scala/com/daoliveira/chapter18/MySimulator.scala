package com.daoliveira.chapter18

object MySimulator extends CircuitSimulation with App {
  def InverterDelay = 1
  def AndGateDelay = 3
  def OrGateDelay = 5

  // Circuit Design
  val input1, input2, sum, carry = new Wire
  probe("sum", sum)
  probe("carry", carry)
  halfAdder(input1, input2, sum, carry)

  // Simulation 01
  input1 setSignal true
  run()

  // Simulation 02
  input2 setSignal true
  run()
}
