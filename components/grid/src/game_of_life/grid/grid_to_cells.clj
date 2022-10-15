(ns game-of-life.grid.grid-to-cells)

(defn x-indexes
  "Takes a grid row, e.g. '---x--', and returns the
   indexes of the x characters, [3] in this case."
  [grid-row]
  (mapv first
        (filter (fn [[_ c]] (= \x c))
                (map-indexed vector grid-row))))

(defn row-cells
  "Takes a y-index and a grid row and returns the corresponding cells."
  [y-index grid-row]
  (mapcat #(vector (vector %1 %2))
          (x-indexes grid-row)
          (repeat y-index)))

(defn add-row-cells [result [index grid-row]]
  (into result (row-cells index grid-row)))

(defn cells [grid]
  (reduce add-row-cells #{}
          (map-indexed vector grid)))
