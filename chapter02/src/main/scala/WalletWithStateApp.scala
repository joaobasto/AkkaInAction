import akka.actor.typed.ActorSystem

object WalletWithStateApp extends App {

  val guardian: ActorSystem[WalletWithState.Command] =
    ActorSystem(WalletWithState(0, 2), "wallet-with-state")
  guardian ! WalletWithState.Increase(1)
  guardian ! WalletWithState.Increase(1)
  guardian ! WalletWithState.Increase(1)

  println("Press ENTER to terminate")
  scala.io.StdIn.readLine()
  guardian.terminate()

}