(ns game-of-life.life.interface-test
  (:require [clojure.test :refer :all]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.interface :as life]))

(deftest is-cell-alive?
  (is (= true
         (life/alive? [0 0] #{[0 0]}))))

(deftest is-cell-dead?
  (is (= false
         (life/alive? [1 0] #{[0 0]}))))


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
