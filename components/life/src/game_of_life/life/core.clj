(ns game-of-life.life.core
  (:require [clojure.set :as set]))

;; - Any live cell with two or three live neighbours survives.
;; - Any dead cell with three live neighbours becomes a live cell.
;; - All other live cells die in the next generation. Similarly, all other dead cells stay dead.


; living cell (number of surrounding cells) / action
;===================================================
; 0  remove
; 1  remove
; 2  do nothing
; 3  do nothing
; 4  remove
; 5  remove
; 6  remove
; 7  remove
; 8  remove

; dead cell (number of surrounding cells) / action
; ================================================
; 0  do nothing
; 1  do nothing
; 2  do nothing
; 3  add
; 4  do nothing
; 5  do nothing
; 6  do nothing
; 7  do nothing
; 8  do nothing

(def offsets [[-1 -1] [0 -1] [1 -1]
              [-1 0] [1 0]
              [-1 1] [0 1] [1 1]])

(defn alive? [cell cells]
  (contains? cells cell))

(defn neighbor [[x y] [dx dy]]
  [(+ x dx)
   (+ y dy)])

(defn neighbors [cell]
  (set (mapv #(neighbor cell %)
             offsets)))

(defn count-neighbors [cell cells]
  (count (set/intersection cells
                           (neighbors cell))))

(defn survives? [cell cells]
  (contains? #{2 3}
             (count-neighbors cell cells)))
