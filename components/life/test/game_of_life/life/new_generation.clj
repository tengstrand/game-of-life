(ns game-of-life.life.new-generation
  (:require [clojure.test :refer :all]
            [game-of-life.life.interface :as life]
            [game-of-life.grid.interface :as grid]))

(def glider (grid/cells ["--x"
                         "x-x"
                         "-xx"]))

(deftest first-generation
  (is (= ["-x--"
          "--xx"
          "-xx-"]
         (grid/grid (life/new-generation glider)))))

(deftest second-generation
  (is (= ["--x-"
          "---x"
          "-xxx"]
       (grid/grid (-> glider
                      life/new-generation
                      life/new-generation)))))

(deftest third-generation
  (is (= ["----"
          "-x-x"
          "--xx"
          "--x-"]
         (grid/grid (-> glider
                        life/new-generation
                        life/new-generation
                        life/new-generation)))))
