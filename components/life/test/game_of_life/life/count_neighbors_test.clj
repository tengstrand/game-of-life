(ns game-of-life.life.count-neighbors-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.core :as life]))

(def cells (grid/cells ["--x"
                        "-x-"
                        "xx-"]))

(deftest left-upper-corner-cell
  (is (= 1
         (life/count-neighbors [0 0] cells))))

(deftest top-center-cell
  (is (= 2
         (life/count-neighbors [1 0] cells))))

(deftest left-center-cell
  (is (= 3
         (life/count-neighbors [0 1] cells))))
