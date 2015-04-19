(ns euler-3.core)

(defn evenly-divides?
  [dividend divisor]
  (= 0 (rem dividend divisor)))

(defn prime?
  [n]
  (not (some (partial evenly-divides? n) (range 2 (+ 1 (/ n 2))))))

(defn primes
  []
  (conj (filter prime? (filter odd? (iterate inc 3))) 2))

(defn prime-factors
  [n]
  (loop [left n
         primes-to-test (primes)
         found-primes []]
    (if (= 1 left)
      found-primes
      (let [[prime] primes-to-test]
        (if (evenly-divides? left prime)
          (recur (/ left prime) (primes) (conj found-primes prime))
          (recur left (rest primes-to-test) found-primes))))))
