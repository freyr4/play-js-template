package com.sam.playjsretry

import com.sam.playjsretry.shared.SharedMessages
import org.scalajs.dom

object ScalaJSExample {
  def main(args: Array[String]): Unit = {
    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}
