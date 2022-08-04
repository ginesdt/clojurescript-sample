(ns tests.all
  (:require [clojure.test :refer [deftest is testing]]
            [sample :as s]))

(deftest tests

  (is (= 4 (s/sample-fn 4))))