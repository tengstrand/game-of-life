(ns game-of-life.grid.grid-to-cells-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]))

(def glider ["--x"
             "x-x"
             "-xx"])

(def glider-cells (grid/cells glider))

(deftest grid
  (is (= glider
         (grid/grid glider-cells))))
