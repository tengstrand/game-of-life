(ns game-of-life.renderer.interface
  (:require [game-of-life.renderer.core :as core]))

(defn animate
  "Opens a window and animates the given grid."
  [grid]
  (core/animate grid))

(defn reset-grid
  "Uses to reset the grid while animating."
  [grid]
  (core/reset-grid grid))
