(ns multivariate-gaussian.core-test
  (:require [clojure.test :refer :all]
            [clojure.core.matrix :refer [array set-current-implementation]]
            [multivariate-gaussian.core :refer :all]))

(set-current-implementation :vectorz)

(deftest calculate-probability
  (testing "Successfully calculates probability"
    (let [mu (array [0 0])
          sigma (array [[0.2 0] [0 0.2]])
          x (array [0.1 0.1])
          eps (probability mu sigma x)]
      (is (< 0.75 eps 0.76)))))
