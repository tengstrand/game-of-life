(ns game-of-life.renderer.core
  (:require [clojure.set :as set]
            [quil.core :as q]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.interface :as life]))

(def cell-width 10)
(def cell-color 120)
(def background-color 220)

(def prev-cells (atom #{}))
(def cells (atom #{}))

(def glider (grid/cells ["--x"
                         "x-x"
                         "-xx"]))

(defn restart []
  (reset! cells glider))

(defn setup []
  (restart)
  (q/frame-rate 10)
  (q/stroke background-color)
  (q/background background-color))

(defn draw-cells [cells fill-color]
  (q/fill fill-color)
  (doseq [[x y] cells]
    (q/rect (* x cell-width)
            (* y cell-width)
            cell-width
            cell-width)))

(defn draw []
  (draw-cells @cells cell-color)
  (draw-cells (set/difference @prev-cells @cells) background-color)
  (reset! prev-cells @cells)
  (swap! cells life/next-generation))

(defn animate []
  (q/defsketch game-of-life
               :title "Game of life"
               :setup setup
               :draw draw
               :size [800 600]))
