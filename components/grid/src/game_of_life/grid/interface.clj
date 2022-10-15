(ns game-of-life.grid.interface
  (:require [game-of-life.grid.core :as core]))

(defn cells
  "Takes a text based grid and returns its cells."
  [grid]
  (core/cells grid))
