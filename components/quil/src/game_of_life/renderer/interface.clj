(ns game-of-life.renderer.interface
  (:require [game-of-life.renderer.core :as core]))

(defn animate
  "Open a window and start animate."
  []
  (core/animate))

(defn init-grid
  "Set the initial grid."
  [grid]
  (core/init-grid grid))
