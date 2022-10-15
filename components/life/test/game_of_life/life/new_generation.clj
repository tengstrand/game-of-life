(ns game-of-life.life.new-generation
  (:require [clojure.test :refer :all]
            [game-of-life.life.core :as core]
            [game-of-life.grid.interface :as grid]))

(def glider (grid/cells ["--x"
                         "x-x"
                         "-xx"]))

(deftest new-generation
  (is (= ["-x--"
          "--xx"
          "-xx-"]
         (grid/grid (core/new-generation glider)))))
