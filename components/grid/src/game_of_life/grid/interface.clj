(ns game-of-life.grid.interface
  (:require [game-of-life.grid.grid-to-cells :as grid-to-cells]
            [game-of-life.grid.cells-to-grid :as cells-to-grid]))

(defn cells
  "Takes a text based grid and returns its cells."
  [grid]
  (grid-to-cells/cells grid))

(defn grid
  "Takes cells and returns a text based grid."
  [cells]
  (cells-to-grid/grid cells))
