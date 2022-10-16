(ns game-of-life.quil-cli.core
  (:require [game-of-life.renderer.interface :as renderer]))

(defn -main
  "Animates a glider using quil (https://github.com/quil/quil)"
  []
  (renderer/animate ["--x"
                     "x-x"
                     "-xx"]))
