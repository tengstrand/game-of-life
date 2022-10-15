(ns game-of-life.grid.cells-to-grid-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]))

(deftest cells
  (is (= #{[2 0]
           [0 1] [2 1]
           [2 2] [1 2]}
         (grid/cells ["--x"
                      "x-x"
                      "-xx"]))))
