(ns gracebot.edit-me-test
  (:require
    [gracebot.edit-me :refer :all]
    [jubot.test :refer :all]
    [clojure.test :refer :all]))

(deftest test-your-first-handler
  (are [x y] (= x (your-first-handler y))
    nil    {}
    "bar" {:text "foo"}))
