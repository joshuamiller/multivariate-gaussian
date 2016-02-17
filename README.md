# multivariate-gaussian

A Clojure library for working with
[multivariate Gaussian distributions](https://en.wikipedia.org/wiki/Multivariate_normal_distribution).

Inspired by [week 9 of Andrew Ng's Machine Learning course](https://www.coursera.org/learn/machine-learning/home/week/9).

## Usage

```clj
(use 'multivariate-gaussian.core)
(use 'clojure.core.matrix) ;; Vector arguments should be clojure.core.matrix arrays

(def mu (array [0 0]))
(def sigma (array [[0.2 0] [0 0.2]]))
(def x (array [0.1 0.1]))

(probability mu sigma x)
;; 0.75696
```

## License

Copyright © 2016 Joshua Miller

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
