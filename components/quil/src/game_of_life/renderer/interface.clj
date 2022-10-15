(ns game-of-life.renderer.interface
  (:require [game-of-life.renderer.core :as core]))

(defn animate
  "Open a window and start animate."
  []
  (core/animate))

(defn restart
  "Restart from the initial position."
  []
  (core/restart))
