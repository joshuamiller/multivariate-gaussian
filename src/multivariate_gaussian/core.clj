(ns multivariate-gaussian.core
  (:require [clojure.core.matrix :refer [div sub exp emul esum det inverse
                                         inner-product outer-product
                                         transpose row-count]]
            [clojure.core.matrix.stats :refer [mean]]))

(defn covariance
  "Calculate covariance matrix"
  [x]
  (let [mu (mean x)]
    (div
     (inner-product (sub x mu) (transpose (sub x mu)))
     (row-count x))))

(defn probability
  "Calculate epsilon given mean, covariance matrix, and X"
  [mu sigma x]
  (let [x-minus-mu (sub x mu)
        n (row-count mu)]
    (*  (exp (* -0.5 (esum
                      (emul (transpose x-minus-mu)
                            (inverse sigma)
                            x-minus-mu))))
        (Math/pow (* 2 Math/PI) (* n -0.5))
        (Math/pow (det sigma) -0.5))))
