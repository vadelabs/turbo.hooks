(ns user)

(defn start
  []
  (js/console.log "Started..."))

(defn stop
  []
  (js/console.log "Stopped..."))

(defn restart
  []
  (stop)
  (start))
