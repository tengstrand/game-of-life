(ns game-of-life.life.alive-test
  (:require [clojure.test :refer :all]
            [game-of-life.life.core :as life]))

(deftest is-cell-alive?
  (is (= true
         (life/alive? [0 0] #{[0 0]}))))

(deftest is-cell-dead?
  (is (= false
         (life/alive? [1 0] #{[0 0]}))))
