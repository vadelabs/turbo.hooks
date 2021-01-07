(ns com.vadelabs.turbo.layouts.landing
  (:require
   [com.vadelabs.turbo.component :as tc]
   [com.vadelabs.turbo.sections.header :as tsh]
   [com.vadelabs.turbo.dom :as td]))

(tc/defui One
  [_ {:landing/keys [styles header]}]
  {:fetcher [:landing/styles
             {:landing/header (tc/fetcher tsh/Header)}]
   :initializer (fn [_]
                  {:landing/styles "flex flex-col min-h-screen overflow-hidden"
                   :landing/header (tc/initializer tsh/Header)})}
  (td/div
   {:class styles}
   (tsh/header header)
   (td/main {:class "flex-grow"})))

(def one (tc/factory One))
