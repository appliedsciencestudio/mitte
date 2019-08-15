(ns mitte.examples
  (:require [clojure.string :as str]
            [clojure.set :as set]
            [goog.object :as gobj]))

(comment

  ;; use required namespaces
  (str/upper-case "a")
  (set/difference #{:a :b} #{:a})

  ;; list globals
  (this-as this
    (set (js/Object.keys this)))

  ;; print to console (nothing special implemented here)
  (prn {:example-of-printed-thing []})

  (throw (js/Error. "Whatever"))

  (prn "HELLO" {:10 10 :20 20})

  ;; fails
  ;; 1. :foreign-libs aren't being processed
  ;; 2. even when processed, there are issues with the "sax" dep
  (require '[tubax.core]))
