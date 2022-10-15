(ns game-of-life.renderer.core
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(def cell-width 10)

(def cells [[10 10] [12 15]])

(defn setup []
  (q/frame-rate 2)
  (q/background 220)
  (q/fill 120)
  cells)

(defn draw [cells]
  (doseq [[x y] cells]
    (q/rect (* x cell-width)
            (* y cell-width)
            cell-width
            cell-width)))

(defn animate []
  (q/defsketch game-of-life
               :title "Game of life"
               :setup setup
               :draw draw
               :size [800 600]
               :middleware [m/fun-mode]))
