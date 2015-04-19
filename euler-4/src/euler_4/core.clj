(ns euler-4.core)

(def pairs
  (let [three-digit (range 100 1000)]
    (for [x (reverse three-digit) y (reverse three-digit)] [y x])))

(defn calc []
  (map (fn [[a b]] (* a b)) pairs))

(defn palindrome? [n]
  (let [num-as-chars (seq (format "%s" n))]
    (every? (fn [[a b]] (= a b))
            (partition 2 2 (interleave num-as-chars (reverse num-as-chars))))))

(def answer
  (apply max (filter palindrome? (calc))))
