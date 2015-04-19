(ns euler-2.core)

(defn fibo []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))
