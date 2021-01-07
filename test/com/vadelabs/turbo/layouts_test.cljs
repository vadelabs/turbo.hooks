(ns com.vadelabs.turbo.layouts-test
  (:require
   [devcards.core :as dc])
  (:require-macros
   [devcards.core :as dc :refer [deftest]]
   [cljs.test :refer [is testing]]))

(defn ^:export start
  []
  (devcards.core/start-devcard-ui!)
  (js/console.log "Started..."))

(defn ^:export stop
  []
  (js/console.log "Stopped..."))

(defn restart
  []
  (stop)
  (start))
