(ns gracebot.edit-me
  (:require
    [jubot.handler :as handler]))

(defn hello-handler
  "Welcome to jubot!"
  [{text :text}]
  (if (= text "hello") "hi there human"))
