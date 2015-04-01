(ns gracebot.edit-me-test
  (:require
    [gracebot.edit-me :refer :all]
    [jubot.test :refer :all]
    [clojure.test :refer :all]))

(deftest test-hello-handler
  (are [x y] (= x (hello-handler y))
    nil    {}
    "hi there human" {:text "hello"}))
