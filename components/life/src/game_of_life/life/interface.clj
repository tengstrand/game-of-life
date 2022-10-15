(ns game-of-life.life.interface
  (:require [game-of-life.life.core :as core]))

(defn next-generation
  "From Wikipedia:
   - Any live cell with two or three live neighbours survives.
   - Any dead cell with three live neighbours becomes a live cell.
   - All other live cells die in the next generation.
     Similarly, all other dead cells stay dead."
  [cells]
  (core/nex-generation cells))
