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

(defn survives? [cell cells]
  (contains? #{2 3}
             (count-neighbors cell cells)))

(defn create? [cell cells]
  (and (not (alive? cell cells))
       (= 3 (count-neighbors cell cells))))

(defn cells-to-create [cells]
  (set (filter #(create? % cells)
               (into #{}
                     (mapcat neighbors cells)))))

(defn cells-that-survive [cells]
  (set (filter #(survives? % cells) cells)))

(defn nex-generation [cells]
  (set/union (cells-to-create cells)
             (cells-that-survive cells)))
