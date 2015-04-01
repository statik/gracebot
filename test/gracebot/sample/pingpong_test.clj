(ns gracebot.sample.pingpong-test
  (:require
    [gracebot.sample.pingpong :refer :all]
    [jubot.test :refer :all]
    [clojure.test :refer :all]))

(deftest test-ping-handler
  (are [x y] (= x (ping-handler y))
    nil    {}
    "pong" {:text "ping"}))
