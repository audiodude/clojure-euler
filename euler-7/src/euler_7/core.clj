(ns euler-7.core
  (:require [clojure.math.numeric-tower :as math]))

(defn evenly-divides?
  [dividend divisor]
  (= 0 (rem dividend divisor)))

(defn prime?
  [n]
  (not (some (partial evenly-divides? n) (range 2 (+ 1 (math/sqrt n))))))

(defn primes
  []
  (conj (filter prime? (filter odd? (iterate inc 3))) 2))
