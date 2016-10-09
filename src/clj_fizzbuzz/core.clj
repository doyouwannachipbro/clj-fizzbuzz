(ns clj-fizzbuzz.core)

(defn fizzbuzz [n]
  (cond
    (= n 5) "buzz"
    (= n 3) "fizz"
    :else n))
