(ns euler-9.core)

(defn increasing? [[a b c]]
   (and (< a b) (< b c)))

(defn pyth-triplet? [[a b c]]
  (and (increasing? [a b c])
       (= (+ (* a a) (* b b)) (* c c))))

(defn sums-to-1000? [[a b c]]
  (= 1000 (+ a b c)))

(defn triplets []
  (let [first-thousand (range 1 1001)]
    (for [x first-thousand y first-thousand z first-thousand] [x y z])))
