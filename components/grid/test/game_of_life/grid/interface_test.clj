(ns game-of-life.grid.interface-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]))

(deftest cells
  (is (= #{[2 0]
           [1 1]
           [0 2] [1 2]}
         (grid/cells ["--x"
                      "-x-"
                      "xx-"]))))
