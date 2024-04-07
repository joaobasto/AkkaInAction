package questionwithpayload

import akka.actor.typed.ActorSystem

object QuestionWithPayloadApp extends App {

  val guardian: ActorSystem[Guardian.Command] =
    ActorSystem(Guardian(), "LoadedQuestion")
  guardian ! Guardian.Start

  println("press ENTER to terminate")
  scala.io.StdIn.readLine()
  guardian.terminate()
}