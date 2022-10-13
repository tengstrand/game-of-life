(ns dev.joakim
  (:require [quil.core :as q :include-macros true]))

(def rect-width 10)

(defn setup []
  (q/frame-rate 50)
  (q/background 220))

(defn random-coord []
  (-> (q/random (q/width))
      (quot rect-width)
      (* rect-width)))

(defn draw []
  (q/fill 120)

  (let [x (random-coord)
        y (random-coord)]
    (q/rect x y rect-width rect-width)))

(q/defsketch game-of-life
             :title "Game of life"
             :setup setup
             :draw draw
             :size [800 600])
