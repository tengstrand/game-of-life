(ns game-of-life.life.interface
  (:require [game-of-life.life.core :as core]))

(defn alive? [cell cells]
  (core/alive? cell cells))

(defn count-neighbors [cell cells]
  (core/count-neighbors cell cells))

(defn survives? [cell cells]
  (core/survives? cell cells))

(defn create? [cell cells]
  (core/create? cell cells))

(defn cells-to-create [cells]
  (core/cells-to-create cells))
