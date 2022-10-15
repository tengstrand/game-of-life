(ns game-of-life.renderer.interface
  (:require [game-of-life.renderer.core :as core]))

(defn animate []
  (core/animate))
