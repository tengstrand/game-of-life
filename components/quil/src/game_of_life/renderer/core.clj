(ns game-of-life.renderer.core
  (:require [clojure.set :as set]
            [quil.core :as q]
            [game-of-life.grid.interface :as grid]
            [game-of-life.life.interface :as life]))

(def cell-width 10)
(def cell-color 120)
(def background-color 220)

(def start-grid (atom #{}))
(def prev-cells (atom #{}))
(def cells (atom #{}))

(defn reset-grid [grid]
   (let [grid-cells (grid/cells grid)]
     (reset! cells grid-cells)
     (reset! start-grid grid)))

(defn setup []
  (reset-grid @start-grid)
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

(defn animate [grid]
  (reset-grid grid)
  (q/defsketch game-of-life
               :title "Game of life - using Quil"
               :setup setup
               :draw draw
               :size [800 600]))
