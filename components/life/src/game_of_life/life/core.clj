(ns game-of-life.life.core
  (:require [clojure.set :as set]))

(def offsets [[-1 -1] [0 -1] [1 -1]
              [-1 0] [1 0]
              [-1 1] [0 1] [1 1]])

(defn alive? [cell cells]
  (contains? cells cell))

(defn neighbor [[x y] [dx dy]]
  [(+ x dx)
   (+ y dy)])

(defn neighbors [cell]
  (set (mapv #(neighbor cell %)
             offsets)))

(defn count-neighbors [cell cells]
  (count (set/intersection cells
                           (neighbors cell))))
