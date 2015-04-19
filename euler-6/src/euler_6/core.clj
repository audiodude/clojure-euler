(ns euler-6.core)

(defn sum-square-diff [n]
  (-
   (let [sum (reduce + (range 1 (+ n 1)))]
     (* sum sum))
   (reduce + (map #(* % %) (range 1 (+ n 1))))))
