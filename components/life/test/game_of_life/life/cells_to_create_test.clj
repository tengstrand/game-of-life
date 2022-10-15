(ns game-of-life.life.cells-to-create-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.core :as life]))

(def cells (grid/cells ["xxx-"
                        "-x--"
                        "----"]))

(deftest cells-to-create
  (is (= #{[1 -1] [2 1] [0 1]}
         (life/cells-to-create cells))))
