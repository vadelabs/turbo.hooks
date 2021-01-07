(ns com.vadelabs.turbo.layouts-card
  (:require
   [devcards.core :as dc])
  (:require-macros
   [devcards.core :refer [defcard]]))

(defn ^:export start
  []
  (dc/start-devcard-ui!)
  (js/console.log "Started..."))

(defn ^:export stop
  []
  (js/console.log "Stopped..."))

(defn restart
  []
  (stop)
  (start))
