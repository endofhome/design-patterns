#Fluctuator

My first experiment with the Observer pattern.

The Observer Pattern defines a one-to-many dependency between objects, so that when one object changes state, all of its dependents are notified and updated automatically.
This is a kind of data-binding, in my (perhaps naïve) understanding similar to the update behaviours of the model, controller and view in MVC.
I used an abstract class ```Opinionated``` to implement the ```information``` method, this isn't related to Observer pattern but was used just to save duplicating the code across the ```Observer``` concrete classes.

### Run the program

Compile the code and run the main method in `Fluctuator`.

Program output will be:

```
£€$ ~~   TODAY'S RATE: 1.5 EUR TO 1 GBP   ~~ $€£
THE OPTIMIST says:
See! I told you it would all be fine. Boris knew what he was doing after all. We're laughin' all the way to the bank.
THE PESSIMIST says:
It can only go down. And it will. We're doomed. I saw it in an Adam Curtis movie.
THE ANARCHIST says:
Buy Bitcoin!

£€$ ~~   TODAY'S RATE: 1.1 EUR TO 1 GBP   ~~ $€£
THE OPTIMIST says:
Our exports will be up, Nigel said. They don't make warm beer like ours anywhere else in the  world!
THE PESSIMIST says:
Groan.
THE ANARCHIST says:
Crash JP Morgan. Buy silver!

£€$ ~~   TODAY'S RATE: 0.4 EUR TO 1 GBP   ~~ $€£
THE OPTIMIST says:
Our exports will be up, Nigel said. They don't make warm beer like ours anywhere else in the  world!
THE PESSIMIST says:
DOOOOOOOOOOMED. I'm heading into my bunker and cracking out the sardines. Good job I saved all those old copper two-pence pieces.
THE ANARCHIST says:
Crash JP Morgan. Buy silver!

Things are looking up! We only need a positive view...
£€$ ~~   TODAY'S RATE: 1.8 EUR TO 1 GBP   ~~ $€£
THE OPTIMIST says:
See! I told you it would all be fine. Boris knew what he was doing after all. We're laughin' all the way to the bank.
```