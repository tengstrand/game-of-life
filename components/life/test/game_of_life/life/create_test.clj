(ns game-of-life.life.create-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.interface :as life]))

(def cells (grid/cells ["xxx-"
                        "-x--"
                        "----"]))

(deftest dont-create-when-number-of-neighbours-are-not-exact-three
  (is (= false
         (life/create? [0 2] cells))))

(deftest dont-create-if-cell-is-not-dead
  (is (= false
         (life/create? [1 1] cells))))

(deftest create-if-dead-cell-with-three-neighbours
  (is (= true
         (life/create? [2 1] cells))))
