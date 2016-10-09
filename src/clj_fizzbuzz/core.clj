(ns clj-fizzbuzz.core)

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 5)) "buzz"
    (= 0 (mod n 3)) "fizz"
    :else n))
