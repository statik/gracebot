(ns gracebot.core
  "===================================
   YOU DO NOT NEED TO MODIFY THIS FILE
   ==================================="
  (:require
    [jubot.core :refer [jubot]]))

(def ns-prefix #"^gracebot\.")

(def -main (jubot :ns-regexp ns-prefix))
