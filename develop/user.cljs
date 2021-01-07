(ns user
  (:require
   [com.vadelabs.turbo :as t]
   [com.vadelabs.turbo.component :as tc]
   [com.vadelabs.turbo.layouts.landing :as tll]))

(defonce app (t/app))

;; (tc/defui Root
;;   [_ _]
;;   (tl/landing-page-one))

(defn start
  []
  (t/attach! app tll/One "app")
  (js/console.log "Started..."))

(defn stop
  []
  (js/console.log "Stopped..."))

(defn restart
  []
  (stop)
  (start))
