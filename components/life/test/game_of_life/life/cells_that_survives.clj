(ns game-of-life.life.cells-that-survives
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.core :as life]))

(def cells (grid/cells ["---x-"
                        "--x--"
                        "xxx-x"]))

(deftest cells-that-survive
  (is (= #{[2 1]
           [1 2] [2 2]}
         (life/cells-that-survive cells))))
