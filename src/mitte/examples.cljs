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
  (prn :examples)

  )