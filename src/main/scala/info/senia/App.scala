package info.senia

import zio.*
import zio.cli.*

object App extends ZIOCliDefault {

  private val a = Options.text("a").map(identity)
  private val b = Options.text("b").map(identity)

  override def cliApp: CliApp[Any with ZIOAppArgs with Scope, Any, Any] =
    CliApp.make(
      "test",
      "0.1.0",
      HelpDoc.Span.text("Reproduce issue"),
      command = Command("test", a | b),
    ) { _ => ZIO.unit }
}


