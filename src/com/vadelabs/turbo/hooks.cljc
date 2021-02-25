(ns com.vadelabs.turbo.hooks
  #?(:cljs (:require
            ["react" :as react]
            [goog.object :as gobj]))
  #?(:cljs (:require-macros [com.vadelabs.turbo.hooks])))

#?(:cljs
   (do (def raw-use-effect react/useEffect)
       (def raw-use-layout-effect react/useLayoutEffect)
       (def raw-use-memo react/useMemo)
       (def raw-use-callback react/useCallback)
       (def raw-use-imperative-handle react/useImperativeHandle)))

#?(:cljs
   (defn use-state
     [initial]
     (let [[v u] (react/useState initial)
           updater (react/useCallback (fn updater
                                        ([x] (u x))
                                        ([f & xs]
                                         (updater (fn spread-updater [x]
                                                    (apply f x xs)))))
                                      #js [])]
       [v updater])))
