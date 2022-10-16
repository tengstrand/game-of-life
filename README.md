# Game of life

This is [Game of life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) 
implemented in Clojure,
using the [Polylith](https://polylith.gitbook.io/polylith) architecture,
and rendered by [Quil](https://github.com/quil/quil).

The program only animates a [glider](https://conwaylife.com/wiki/Glider) at the moment:

![glider.png](glider.png)

### Prerequisites
- git (https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- clj (https://clojure.org/guides/install_clojure)

### Clone + execute
```
$ git clone git@github.com:tengstrand/game-of-life.git
$ cd game-of-life
$ clj -M:quil
```

### The poly tool ###
If you want to experiment with the poly tool, start a poly shell:

```
$ clj -M:poly
```

![poly-shell.png](poly-shell.png)

And then e.g. type `info` and press enter:

![workspace.png](workspace.png)

The poly tool documentation can be found [here](https://polylith.gitbook.io/poly).
The list of available commands can shown by typing `help` from the poly shell.
