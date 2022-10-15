(ns game-of-life.life.survives-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.core :as life]))

(def cells (grid/cells ["---x-"
                        "--x--"
                        "xxx-x"]))

(deftest zero-neighbours--dies
  (is (= false
         (life/survives? [0 0] cells))))

(deftest one-neighbours--dies
  (is (= false
         (life/survives? [1 0] cells))))

(deftest two-neighbours--survives
  (is (= true
         (life/survives? [2 0] cells))))

(deftest three-neighbours--survives
  (is (= true
         (life/survives? [3 2] cells))))

(deftest four-neighbours--dies
  (is (= false
         (life/survives? [1 1] cells))))
