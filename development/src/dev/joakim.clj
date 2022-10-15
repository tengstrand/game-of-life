(ns dev.joakim
  (:require [game-of-life.renderer.interface :as renderer]))

(comment
  (renderer/init-grid ["--x"
                       "x-x"
                       "-xx"]) ; The start grid has a glider.
  (renderer/animate) ; Open window and start animate
  #__)
