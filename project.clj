(defproject multivariate-gaussian "0.1.0-SNAPSHOT"
  :description "Tools for working with multivariate Gaussian distributions"
  :url "http://github.com/joshuamiller/multivariate-gaussian"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.49.0"]
                 [net.mikera/vectorz-clj "0.43.0"]]
  :profiles
  {:dev
   {:dependencies [[org.clojure/tools.namespace "0.3.0-alpha3"]]
    :source-paths ["dev"]}})
