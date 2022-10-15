(ns game-of-life.grid.cells-to-grid
  (:require [clojure.string :as str]))

(defn add-cell [grid [x y]]
  (assoc-in grid [y x] "x"))

(defn grid
  "Converts cells to a grid."
  [cells]
  (let [width (inc (apply max (map first cells)))
        height (inc (apply max (map second cells)))
        grid (vec (repeat height
                          (vec (repeat width "-"))))]
    (mapv str/join
          (reduce add-cell grid cells))))
