(ns dev.joakim
  (:require [game-of-life.renderer.interface :as renderer]))

(comment
  (renderer/animate ["--x"
                     "x-x"
                     "-xx"]) ; Open window and start animate the given grid.
  ;(renderer/init-grid ["--x"])

  #__)
